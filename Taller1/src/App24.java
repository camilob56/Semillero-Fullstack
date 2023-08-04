import javax.swing.JOptionPane;

public class App24 {
    public static void main(String[] args) {
        // 24. 
        String cadena = JOptionPane.showInputDialog("Por favor ingresa una cadena de texto");
        String letra = JOptionPane.showInputDialog("Ingresa la letra que deseas cambiar");
        String cambio = JOptionPane.showInputDialog("Ingresa la letra por la que la vas a cambiar");
        if (cadena.matches("[a-zA-Z\\s]+") && letra.matches("[a-zA-Z]+") && cambio.matches("[a-zA-Z]")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < cadena.length(); i++) {
                if (letra.length() > 0 && cadena.charAt(i) == letra.charAt(0)) {
                    sb.append(cambio.charAt(0));
                } else {
                    sb.append(cadena.charAt(i));
                }
            }
            JOptionPane.showMessageDialog(null, "Cadena ingresada: " + cadena + "\nCadena modificada: " + sb.toString());

        } else {
            JOptionPane.showMessageDialog(null, "El dato ingresado no es una cadena, por favor solo letras");
        }
    }
}
