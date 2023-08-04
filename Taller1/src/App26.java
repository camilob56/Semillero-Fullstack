import javax.swing.JOptionPane;

public class App26 {
    public static void main(String[] args){
        // 26.
        String cadena = JOptionPane.showInputDialog("Por favor ingresa una cadena de texto");
        
        if (cadena.matches("[a-zA-Z\\s]*")) {
            StringBuilder sb = new StringBuilder();
            int caracteres = 0;
            for(int i = 0; i <cadena.length(); i++){
                if(cadena.charAt(i) != ' '){
                    caracteres++;
                }
            }
            sb.append("Cadena ingresada: " + cadena).append("\n");
            sb.append("El total de caracteres es de: " + caracteres);
            JOptionPane.showMessageDialog(null, sb.toString());
            
        }else {
            JOptionPane.showMessageDialog(null, "El dato ingresado no es una oracion, por favor solo letras");
        }
    }
}
