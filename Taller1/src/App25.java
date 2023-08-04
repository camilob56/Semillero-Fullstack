import javax.swing.JOptionPane;

public class App25 {
    public static void main(String[] args) {
        // 25.
        String cadena = JOptionPane.showInputDialog("Por favor ingresa una frase en texto");
        if (cadena.matches("[a-zA-Z\\s]+")) {
            StringBuilder sb = new StringBuilder();
            String[] palabras = cadena.split("\\s+"); 
            sb.append("Frase ingresada: " + cadena).append("\n");
            sb.append("Palabras separadas: ").append("\n");
            for (String palabra : palabras) {
                sb.append(palabra).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        } else {
            JOptionPane.showMessageDialog(null, "El dato ingresado no es una cadena, por favor solo letras");
        }
    }
}

