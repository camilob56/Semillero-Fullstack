package empleadossSalarios;

public class PorHoras extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public PorHoras(String nombre, String apellido, String numeroSeguroSocial, double horasTrabajadas, double tarifaPorHora) {
        super(nombre, apellido, numeroSeguroSocial);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaPorHora;
    }
}

