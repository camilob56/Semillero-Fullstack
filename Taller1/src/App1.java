import javax.swing.JOptionPane;

public class App1 {
    public static void main(String[] args){
        // 1.
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número entero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese otro número entero"));
        int suma = num1+num2;
        int resta = num1-num2;
        int multiplicacion = num1*num2;
        int division = num1/num2;
        JOptionPane.showMessageDialog(null, "Los numeros ingresados son: " + num1 + " y " + num2);
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta);
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + multiplicacion);
        JOptionPane.showMessageDialog(null, "El resultado de la division es: " + division);


    }
}
