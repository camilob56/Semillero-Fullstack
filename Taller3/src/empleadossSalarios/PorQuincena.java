package empleadossSalarios;

public class PorQuincena extends Empleado {
    private double salarioQuincenal;

    public PorQuincena(String nombre, String apellido, String numeroSeguroSocial, double salarioQuincenal) {
        super(nombre, apellido, numeroSeguroSocial);
        this.salarioQuincenal = salarioQuincenal;
    }

    @Override
    public double calcularPago() {
        return salarioQuincenal;
    }
}
