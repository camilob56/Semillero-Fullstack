package bancoCuentas.implementaciones;

import javax.swing.JOptionPane;

import bancoCuentas.contratos.CuentaBancaria;

public class CuentaAhorro implements CuentaBancaria {
    private String nombreTitular;
    private int cedula;
    private String direccion;
    private double depositoInicial;
    private double saldo;

    public CuentaAhorro(String nombreTitular, int cedula, String direccion, double depositoInicial) {
        this.nombreTitular = nombreTitular;
        this.cedula = cedula;
        this.direccion = direccion;
        this.depositoInicial = depositoInicial;
        this.saldo = depositoInicial;
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
        return "Nombre del titular: " + nombreTitular + "\n" + "Cédula: " + cedula + "\n" + "Dirección: " + direccion + "\n" + "Saldo actual: " + saldo;
    }

    public double inicial() {
        return depositoInicial;
    }

}
