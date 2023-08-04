import javax.swing.JOptionPane;

public class App20 {
    public static void main(String[] args) {
        // 20. 
        String cadena = JOptionPane.showInputDialog("Por favor ingresa una cadena de texto");
        if(cadena.matches("[a-zA-Z\\s]+")){
            StringBuilder sb = new StringBuilder();
            sb.append("Cadena ingresada: ").append(cadena).append("\n");
            String revertir = new StringBuilder(cadena).reverse().toString();
            sb.append("Cadena revertida: ").append(revertir).append("\n");
            JOptionPane.showMessageDialog(null, sb.toString());
        }else{
            JOptionPane.showMessageDialog(null, "El dato ingresado no es una cadena, por favor solo letras");
        }

    }
}
