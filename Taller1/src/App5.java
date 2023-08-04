import javax.swing.JOptionPane;

public class App5 {
    public static void main(String[] args) {
        // 5.
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número entero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese otro número entero"));
        String resultado = (num1 > num2) ? "El numero mayor es: " + num1 : "El numero mayor es: " + num2;
        JOptionPane.showMessageDialog(null, resultado);
    }
}
