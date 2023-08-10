package Calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        
        String[] opciones = { "1. Sumar", "2. Restar", "3. Multiplicar", "4. Dividir", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione que tipo de operacion desea realizar", "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        // Suma
        if (seleccion == 0) {
            int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
            int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + Operaciones.Sumar(valor1, valor2));
        }
        // Resta
        else if (seleccion == 1) {
            int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
            int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
            JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + Operaciones.Restar(valor1, valor2));
        }
        // Multiplicacion
        else if (seleccion == 2) {
            int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
            int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + Operaciones.Multiplicar(valor1, valor2));
        }
        // Division
        else if (seleccion == 3) {
            double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero:"));
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero:"));
            JOptionPane.showMessageDialog(null, "El resultado de la division es: " + Operaciones.Dividir(valor1, valor2));
        }else{
            JOptionPane.showMessageDialog(null, "Ha salido del programa");
        }

    }
}
