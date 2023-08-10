package ReservaHotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class Hotel {
    private int id;
    private String nombre;
    private String direccion;
    private String estrellas;
    private Habitacion[] habitacionesDisponibles;
    private List<Reserva> reservas;
    private List<Reserva> reservasRealizadas;
    private static List<Reserva> todasLasReservas = new ArrayList<>();

    public void setHabitacionesDisponibles(Habitacion[] habitaciones) {
        this.habitacionesDisponibles = habitaciones;
    }

    public Hotel(int id, String nombre, String direccion, String estrellas) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
        this.habitacionesDisponibles = new Habitacion[0];
        this.reservas = new ArrayList<>();
        this.reservasRealizadas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstrellas() {
        return estrellas;
    }

    public static Hotel[] crearHoteles() {
        Hotel[] hoteles = new Hotel[5]; 
        hoteles[0] = new Hotel(1, "Hotel Bogota Royal", "Calle Principal 123", "3 estrellas");
        hoteles[1] = new Hotel(2, "Hotel Cartagena", "Avenida Central 456", "4 estrellas");
        hoteles[2] = new Hotel(3, "Hotel Medellin", "Plaza Mayor 789", "2 estrellas");
        hoteles[3] = new Hotel(4, "Hotel Santa Marta", "Bulevar Norte 101", "5 estrellas");
        hoteles[4] = new Hotel(5, "Hotel Cali", "Calle del 12 - 222", "3 estrellas");
        return hoteles;
    }
    
    public static void mostrarHoteles(Hotel[] hoteles) {
        String mensaje = "Hoteles disponibles:\n";
        for (Hotel hotel : hoteles) {
            mensaje += "ID: " + hotel.getId() + "\n";
            mensaje += "Nombre: " + hotel.getNombre() + "\n";
            mensaje += "Dirección: " + hotel.getDireccion() + "\n";
            mensaje += "Estrellas: " + hotel.getEstrellas() + "\n";
            mensaje += "-----------------------------------\n";
        }
        
        String inputId = JOptionPane.showInputDialog(null, mensaje + "Ingrese el ID del hotel que desea ver:", "Ver detalles de hotel", JOptionPane.PLAIN_MESSAGE);
        
        if (inputId != null) {
            int hotelId = Integer.parseInt(inputId);
            mostrarHotelDetalle(hoteles, hotelId);
        }
    }
    
    public static void mostrarHotelDetalle(Hotel[] hoteles, int hotelId) {
        Hotel hotelEncontrado = null;
    
        for (Hotel hotel : hoteles) {
            if (hotel.getId() == hotelId) {
                hotelEncontrado = hotel;
                break;
            }
        }
    
        if (hotelEncontrado != null) {
            String mensaje = "Detalles del hotel:\n";
            mensaje += "ID: " + hotelEncontrado.getId() + "\n";
            mensaje += "Nombre: " + hotelEncontrado.getNombre() + "\n";
            mensaje += "Dirección: " + hotelEncontrado.getDireccion() + "\n";
            mensaje += "Estrellas: " + hotelEncontrado.getEstrellas() + "\n";
    
            String[] opciones = { "Ver habitaciones disponibles", "Ver otros hoteles", "Salir" };
            int seleccion = JOptionPane.showOptionDialog(null,mensaje,"Detalles del hotel",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);
    
            if (seleccion == 0) {
                Habitacion[] habitaciones = Habitacion.crearHabitaciones();
                hotelEncontrado.setHabitacionesDisponibles(habitaciones);
                hotelEncontrado.mostrarHabitacionesDisponibles(hoteles, hotelEncontrado);
            } else if (seleccion == 1) {
                mostrarHoteles(hoteles);
            } else {
                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema de reservas de hoteles. ¡Hasta luego!", "Salir", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro un hotel con ese ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrarHabitacionesDisponibles(Hotel[] hoteles, Hotel hotelEncontrado) {
        String mensaje = "Habitaciones disponibles en " + nombre + ":\n";
    
        for (Habitacion habitacion : hotelEncontrado.habitacionesDisponibles) {
            mensaje += "ID: " + habitacion.getId() + "\n";
            mensaje += "Tipo: " + habitacion.getTipo() + "\n";
            mensaje += "Tarifa: " + habitacion.getTarifa() + "\n";
            mensaje += "Capacidad: " + habitacion.getCapacidad() + "\n";
            mensaje += "------------------------------\n";
        }
    
        String[] opciones = { "Reservar habitacion", "Volver" };
        int seleccion = JOptionPane.showOptionDialog(null,mensaje,"Habitaciones disponibles en " + nombre,JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);
    
        if (seleccion == 0) {
            int numHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de habitación a reservar:"));
            String nombreEmpresa = JOptionPane.showInputDialog("Ingrese el nombre de la empresa:");
            String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
            int cedulaEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del empleado:"));
            Cliente cliente = new Cliente(nombreEmpresa, cedulaEmpleado);
            cliente.agregarHuesped(nombreEmpleado);
            hotelEncontrado.realizarReserva(cliente, numHabitacion);         
        } else if (seleccion == 1) {
            mostrarHotelDetalle(hoteles, hotelEncontrado.getId()); 
        }
    }
    
    
    
    public void realizarReserva(Cliente cliente, int numHabitacion) {
        Habitacion habitacionReservada = habitacionesDisponibles[numHabitacion - 1];
        Reserva reserva = new Reserva(reservas.size() + 1, cliente, habitacionReservada, null, null, 1, this); // Pasar "this" como referencia al hotel
        reservas.add(reserva);
        reservasRealizadas.add(reserva);
        String[] opciones = { "Volver a hoteles", "Volver al inicio"};
        int seleccion = JOptionPane.showOptionDialog(null, "Reserva realizada exitosamente:\n\n" +"Habitacion: " + habitacionReservada.getId() + "\n" +"Empresa: " + cliente.getNombreEmpresa() + "\n" +"Cedula empleado: " + cliente.getCedulaEmpleado() + "\n" +"Nombre empleado: " + cliente.getNombresHuespedes() + "\n\n","Confirmacion de Reserva", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,null, opciones, opciones[0]);
        if (seleccion == 0) {
            Hotel[] hotelesDisponibles = Hotel.crearHoteles();
            Hotel.mostrarHoteles(hotelesDisponibles);
        } else if (seleccion == 1) {
            SistemaHotel.mostrarMenuInicial();
        }
    }
    
    public List<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }
    
    public static void mostrarReservasRealizadas(Hotel[] hoteles) {
    }
    

    public void cancelarReserva(int numHabitacion) {
    
    }
}

