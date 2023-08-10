package ConversorMonedas;

public class ConversorMonedas {
    public double convertirMoneda(double monto, double tasa) {
        return Math.round((monto * tasa)*100)/100.0;
    }

}