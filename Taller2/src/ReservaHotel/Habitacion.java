package ReservaHotel;

public class Habitacion {
    private int id;
    private String tipo;
    private double tarifa;
    private int capacidad;

    public Habitacion(int id, String tipo, double tarifa, int capacidad) {
        this.id = id;
        this.tipo = tipo;
        this.tarifa = tarifa;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public static Habitacion[] crearHabitaciones() {
        Habitacion[] habitaciones = new Habitacion[5];

        habitaciones[0] = new Habitacion(1, "Sencilla", 100.0, 1);
        habitaciones[1] = new Habitacion(2, "Doble", 150.0, 2);
        habitaciones[2] = new Habitacion(3, "Suite", 250.0, 4);
        habitaciones[3] = new Habitacion(4, "Familiar", 180.0, 4);
        habitaciones[4] = new Habitacion(5, "Presidencial", 400.0, 2);

        return habitaciones;
    }

    
}
