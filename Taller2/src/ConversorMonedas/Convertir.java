package ConversorMonedas;

import javax.swing.JOptionPane;

public class Convertir {
    public static void main(String[] args) {

        String[] opciones = { "COP - Peso colombiano", "USD - Dólar estadounidense", "EUR - Euro", "GBP - Libra esterlina", "JPY - Yen japonés", "MXN - Peso mexicano", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione que tipo de moneda desea convertir", "Conversor de monedas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        // COP
        if (seleccion == 0) {
            String[] opciones2 = {"USD - Dólar estadounidense", "EUR - Euro", "GBP - Libra esterlina", "JPY - Yen japonés", "MXN - Peso mexicano", "Salir" };
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor:"));
            int seleccion2 = JOptionPane.showOptionDialog(null, "Seleccione a que tipo de moneda desea convertir", "Conversor de monedas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones2, opciones2[0]);
                ConversorMonedas convertir = new ConversorMonedas();
            if(seleccion2 == 0){ 
                double valorConvertido = convertir.convertirMoneda(valor, 0.000245263);
                JOptionPane.showMessageDialog(null, "El valor $ " + valor + " COP es igual a $ " + valorConvertido + " dólares estadounidenses");
            }else if(seleccion2 == 1){
                double valorConvertido = convertir.convertirMoneda(valor, 0.000223948);
                JOptionPane.showMessageDialog(null, "El valor de $ " + valor + " COP es igual a \u20AC " + valorConvertido + " Euros");
            }else if(seleccion2 == 2){
                double valorConvertido = convertir.convertirMoneda(valor, 0.000192609);
                JOptionPane.showMessageDialog(null, "El valor de $ " + valor + " COP es igual a \u00A3 " + valorConvertido + " Libras esterlinas");
            }else if(seleccion2 == 3){
                double valorConvertido = convertir.convertirMoneda(valor, 0.0351839);
                JOptionPane.showMessageDialog(null, "El valor de $ " + valor + " COP es igual a \u00A5 " + valorConvertido + " Yen japonés");
            }else if(seleccion2 == 4){
                double valorConvertido = convertir.convertirMoneda(valor, 0.00419799);
                JOptionPane.showMessageDialog(null, "El valor de $ " + valor + " COP es igual a $ " + valorConvertido + " Pesos Mexicanos");
            }
        //USD
        } else if (seleccion == 1) {
            String[] opciones2 = {"COP - Peso colombiano", "EUR - Euro", "GBP - Libra esterlina", "JPY - Yen japonés", "MXN - Peso mexicano", "Salir" };
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor:"));
            int seleccion2 = JOptionPane.showOptionDialog(null, "Seleccione a que tipo de moneda desea convertir", "Conversor de monedas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones2, opciones2[0]);
                ConversorMonedas convertir = new ConversorMonedas();
            if(seleccion2 == 0){ 
                double valorConvertido = convertir.convertirMoneda(valor, 4081.51);
                JOptionPane.showMessageDialog(null, "El valor $ " + valor + " USD es igual a $ " + valorConvertido + " Pesos colombianos");
            }else if(seleccion2 == 1){
                double valorConvertido = convertir.convertirMoneda(valor, 0.912518);
                JOptionPane.showMessageDialog(null, "El valor de $ " + valor + " USD es igual a \u20AC " + valorConvertido + " Euros");
            }else if(seleccion2 == 2){
                double valorConvertido = convertir.convertirMoneda(valor, 0.784575);
                JOptionPane.showMessageDialog(null, "El valor de $ " + valor + " USD es igual a \u00A3 " + valorConvertido + " Libras esterlinas");
            }else if(seleccion2 == 3){
                double valorConvertido = convertir.convertirMoneda(valor, 143.425);
                JOptionPane.showMessageDialog(null, "El valor de $ " + valor + " USD es igual a \u00A5 " + valorConvertido + " Yen japonés");
            }else if(seleccion2 == 4){
                double valorConvertido = convertir.convertirMoneda(valor, 17.0936);
                JOptionPane.showMessageDialog(null, "El valor de $ " + valor + " USD es igual a $ " + valorConvertido + " Pesos Mexicanos");
            }
        //EUR
        }else if(seleccion == 2){
            String[] opciones2 = {"COP - Peso colombiano", "USD - Dolar estadounidense", "GBP - Libra esterlina", "JPY - Yen japonés", "MXN - Peso mexicano", "Salir" };
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor:"));
            int seleccion2 = JOptionPane.showOptionDialog(null, "Seleccione a que tipo de moneda desea convertir", "Conversor de monedas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones2, opciones2[0]);
                ConversorMonedas convertir = new ConversorMonedas();
            if(seleccion2 == 0){ 
                double valorConvertido = convertir.convertirMoneda(valor, 4473.39);
                JOptionPane.showMessageDialog(null, "El valor \u20AC " + valor + " EUR es igual a $ " + valorConvertido + " Pesos colombianos");
            }else if(seleccion2 == 1){
                double valorConvertido = convertir.convertirMoneda(valor, 1.09614);
                JOptionPane.showMessageDialog(null, "El valor de \u20AC " + valor + " EUR es igual a $ " + valorConvertido + " Dolares estadounidenses");
            }else if(seleccion2 == 2){
                double valorConvertido = convertir.convertirMoneda(valor, 0.859712);
                JOptionPane.showMessageDialog(null, "El valor de \u20AC " + valor + " EUR es igual a \u00A3 " + valorConvertido + " Libras esterlinas");
            }else if(seleccion2 == 3){
                double valorConvertido = convertir.convertirMoneda(valor, 157.194);
                JOptionPane.showMessageDialog(null, "El valor de \u20AC " + valor + " EUR es igual a \u00A5 " + valorConvertido + " Yen japonés");
            }else if(seleccion2 == 4){
                double valorConvertido = convertir.convertirMoneda(valor, 18.7322);
                JOptionPane.showMessageDialog(null, "El valor de \u20AC " + valor + " EUR es igual a $ " + valorConvertido + " Pesos Mexicanos");
            }
        // GBP
        }else if(seleccion == 3){
            String[] opciones2 = {"COP - Peso colombiano", "USD - Dolar estadounidense", "EUR - Euro", "JPY - Yen japonés", "MXN - Peso mexicano", "Salir" };
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor:"));
            int seleccion2 = JOptionPane.showOptionDialog(null, "Seleccione a que tipo de moneda desea convertir", "Conversor de monedas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones2, opciones2[0]);
                ConversorMonedas convertir = new ConversorMonedas();
            if(seleccion2 == 0){ 
                double valorConvertido = convertir.convertirMoneda(valor, 5202.73);
                JOptionPane.showMessageDialog(null, "El valor \u00A3 " + valor + " GBP es igual a $ " + valorConvertido + " Pesos colombianos");
            }else if(seleccion2 == 1){
                double valorConvertido = convertir.convertirMoneda(valor, 1.27461);
                JOptionPane.showMessageDialog(null, "El valor de \u00A3 " + valor + " GBP es igual a $ " + valorConvertido + " Dolares estadounidenses");
            }else if(seleccion2 == 2){
                double valorConvertido = convertir.convertirMoneda(valor, 1.16299);
                JOptionPane.showMessageDialog(null, "El valor de \u00A3 " + valor + " GBP es igual a \u20AC " + valorConvertido + " Euros");
            }else if(seleccion2 == 3){
                double valorConvertido = convertir.convertirMoneda(valor, 182.812);
                JOptionPane.showMessageDialog(null, "El valor de \u00A3 " + valor + " GBP es igual a \u00A5 " + valorConvertido + " Yen japonés");
            }else if(seleccion2 == 4){
                double valorConvertido = convertir.convertirMoneda(valor, 21.7886);
                JOptionPane.showMessageDialog(null, "El valor de \u00A3 " + valor + " GBP es igual a $ " + valorConvertido + " Pesos Mexicanos");
            }
        // JPY
        }else if(seleccion == 4){
            String[] opciones2 = {"COP - Peso colombiano", "USD - Dolar estadounidense", "EUR - Euro", "GBP - Libra esterlina", "MXN - Peso mexicano", "Salir" };
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor:"));
            int seleccion2 = JOptionPane.showOptionDialog(null, "Seleccione a que tipo de moneda desea convertir", "Conversor de monedas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones2, opciones2[0]);
                ConversorMonedas convertir = new ConversorMonedas();
            if(seleccion2 == 0){ 
                double valorConvertido = convertir.convertirMoneda(valor, 28.4575);
                JOptionPane.showMessageDialog(null, "El valor \u00A5 " + valor + " JPY es igual a $ " + valorConvertido + " Pesos colombianos");
            }else if(seleccion2 == 1){
                double valorConvertido = convertir.convertirMoneda(valor, 0.00697268);
                JOptionPane.showMessageDialog(null, "El valor de \u00A5 " + valor + " JPY es igual a $ " + valorConvertido + " Dolares estadounidenses");
            }else if(seleccion2 == 2){
                double valorConvertido = convertir.convertirMoneda(valor,  0.00636292);
                JOptionPane.showMessageDialog(null, "El valor de \u00A5 " + valor + " JPY es igual a \u20AC " + valorConvertido + " Euros");
            }else if(seleccion2 == 3){
                double valorConvertido = convertir.convertirMoneda(valor, 0.00547099);
                JOptionPane.showMessageDialog(null, "El valor de \u00A5 " + valor + " JPY es igual a \u00A3 " + valorConvertido + " Libras esterlinas");
            }else if(seleccion2 == 4){
                double valorConvertido = convertir.convertirMoneda(valor, 0.119201);
                JOptionPane.showMessageDialog(null, "El valor de \u00A5 " + valor + " JPY es igual a $ " + valorConvertido + " Pesos Mexicanos");
            }
        //MXN
        }else if(seleccion == 5){
            String[] opciones2 = {"COP - Peso colombiano", "USD - Dolar estadounidense", "EUR - Euro", "GBP - Libra esterlina", "JPY - Yen japonés", "Salir" };
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor:"));
            int seleccion2 = JOptionPane.showOptionDialog(null, "Seleccione a que tipo de moneda desea convertir", "Conversor de monedas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones2, opciones2[0]);
                ConversorMonedas convertir = new ConversorMonedas();
            if(seleccion2 == 0){ 
                double valorConvertido = convertir.convertirMoneda(valor, 238.784);
                JOptionPane.showMessageDialog(null, "El valor $ " + valor + " MXN es igual a $ " + valorConvertido + " Pesos colombianos");
            }else if(seleccion2 == 1){
                double valorConvertido = convertir.convertirMoneda(valor, 0.0585148);
                JOptionPane.showMessageDialog(null, "El valor de $ " + valor + " MXN es igual a $ " + valorConvertido + " Dolares estadounidenses");
            }else if(seleccion2 == 2){
                double valorConvertido = convertir.convertirMoneda(valor,  0.0533785);
                JOptionPane.showMessageDialog(null, "El valor de $ " + valor + " MXN es igual a \u20AC " + valorConvertido + " Euros");
            }else if(seleccion2 == 3){
                double valorConvertido = convertir.convertirMoneda(valor, 0.0458953);
                JOptionPane.showMessageDialog(null, "El valor de $ " + valor + " MXN es igual a \u00A3 " + valorConvertido + " Libras esterlinas");
            }else if(seleccion2 == 4){
                double valorConvertido = convertir.convertirMoneda(valor, 8.38957);
                JOptionPane.showMessageDialog(null, "El valor de $ " + valor + " MXN es igual a \u00A5 " + valorConvertido + " Yen japonés");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Ha salido del programa");
        }
    }
}
