import javax.swing.JOptionPane;

public class App22 {
    public static void main(String[] args) {
        // 22.
        String cadena = JOptionPane.showInputDialog("Por favor ingresa una palabra sin espacios");
        if (cadena.matches("[a-zA-Z]+")) {
            boolean esPalindromo = true;
            for (int i = 0; i < cadena.length() / 2; i++) {
                if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
                    esPalindromo = false;
                    break;
                }
            }

            if (esPalindromo) {
                JOptionPane.showMessageDialog(null, "La cadena '" + cadena + "' SI es capicua");
            } else {
                JOptionPane.showMessageDialog(null, "La cadena  '" + cadena + "' NO es capicua");
            }

        } else {
            JOptionPane.showMessageDialog(null, "El dato ingresado no es una cadena, por favor solo letras");
        }
    }
}
