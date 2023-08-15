package empleadossSalarios;

public class PorMes extends Empleado {
    private double salarioMensual;

    public PorMes(String nombre, String apellido, String numeroSeguroSocial, double salarioMensual) {
        super(nombre, apellido, numeroSeguroSocial);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}

