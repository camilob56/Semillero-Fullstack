import javax.swing.JOptionPane;

public class App9 {
    public static void main(String[] args) {
        // 9. 
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número entero positivo"));
        if (num1 > 0) {
            long factorial = 1;
            for (int i = 1; i <= num1; i++) {
                factorial *= i;
            }
            JOptionPane.showMessageDialog(null, "El factorial de " + num1 + " es: " + factorial);
        }else {
            JOptionPane.showMessageDialog(null, "El numero ingresado es negativo");
        }

    }
}
