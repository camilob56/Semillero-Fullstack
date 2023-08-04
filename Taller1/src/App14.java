import javax.swing.JOptionPane;

public class App14 {
    public static void main(String[] args) {
        // 14.
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número entero positivo"));
        if (num1 > 0) {
            int suma = 0;
            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    suma += i;
                }
            }
            if (suma == num1) {
                JOptionPane.showMessageDialog(null, "El numero: " + num1 + " SI es perfecto");
            } else {
                JOptionPane.showMessageDialog(null, "El numero: " + num1 + " NO es perfecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El programa no admite numeros negativos");
        }
    }
}
