package bancoCuentas.implementaciones;

import javax.swing.JOptionPane;

import bancoCuentas.contratos.CuentaBancaria;

public class CuentaNomina implements CuentaBancaria {
    private String nombreTitular;
    private int cedula;
    private String direccion;
    private double depositoInicial;
    private double saldo;
    private String empresaEmpleadora;
    private int numeroCuentaNomina;

    public CuentaNomina(String nombreTitular, int cedula, String direccion, double depositoInicial, String empresaEmpleadora, int numeroCuentaNomina) {
        this.nombreTitular = nombreTitular;
        this.cedula = cedula;
        this.direccion = direccion;
        this.depositoInicial = depositoInicial;
        this.saldo = depositoInicial;
        this.empresaEmpleadora = empresaEmpleadora;
        this.numeroCuentaNomina = numeroCuentaNomina;
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }

    @Override
    public double obtenerSaldo() {
        return saldo;
    }

    public String obtenerInformacion() {
        return "Nombre del titular: " + nombreTitular + "\n" + "Cédula: " + cedula + "\n" + "Dirección: " + direccion + "\n" + "Saldo actual: " + saldo + "\n" + "Empresa empleadora: " + empresaEmpleadora + "\n" + "Numero de cuenta de nomina: " + numeroCuentaNomina;
    }

    public double inicial() {
        return depositoInicial;
    }

}
