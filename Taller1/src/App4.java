import javax.swing.JOptionPane;

public class App4 {
    public static void main(String[] args) {
        // 4.
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su edad"));
        String resultado = (edad>=18) ? "Usted es mayor de edad" : "Usted es menor de edad";
        JOptionPane.showMessageDialog(null, resultado);
    }
}
