import javax.swing.JOptionPane;
import java.util.Arrays;

public class App27 {
    public static void main(String[] args){
        // 27.
        String frase = JOptionPane.showInputDialog("Por favor ingresa una frase");
        
        if (frase.matches("[a-zA-Z\\s]*")) {
            String[] palabras = frase.split("\\s+");
            Arrays.sort(palabras);
            StringBuilder sb = new StringBuilder();
            for (String palabra : palabras) {
                sb.append(palabra).append(" ");
            }
            String fraseOrdenada = sb.toString().trim();
            
            StringBuilder output = new StringBuilder();
            output.append("Frase ingresada: ").append(frase).append("\n");
            output.append("Frase ordenada: ").append(fraseOrdenada);
            
            JOptionPane.showMessageDialog(null, output.toString());
        } else {
            JOptionPane.showMessageDialog(null, "El dato ingresado no es una oracion, por favor solo letras");
        }
    }
}

