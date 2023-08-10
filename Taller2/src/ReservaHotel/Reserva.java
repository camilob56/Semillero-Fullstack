package ReservaHotel;

import java.util.Date;

public class Reserva {
    private int id;
    private Cliente cliente;
    private Habitacion habitacion;
    private Date fechaInicio;
    private Date fechaFin;
    private int cantidadPersonas;
    private Hotel hotel; 

    public Reserva(int id, Cliente cliente, Habitacion habitacion, Date fechaInicio, Date fechaFin, int cantidadPersonas, Hotel hotel) {
        this.id = id;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadPersonas = cantidadPersonas;
        this.hotel = hotel;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public Hotel getHotel() {
        return hotel; 
    }
}
