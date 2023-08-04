import javax.swing.JOptionPane;

public class App19 {
    public static void main(String[] args) {
        // 19.
        String nombre = JOptionPane.showInputDialog("Por favor ingresa tu nombre");
        if(nombre.matches("[a-zA-Z\\s]+")){
            StringBuilder sb = new StringBuilder();
            String minuscula = nombre.toLowerCase();
            String mayuscula = nombre.toUpperCase();
            sb.append("Nombre ingresado: ").append(nombre).append("\n");
            sb.append("Nombre en minusculas: ").append(minuscula).append("\n");
            sb.append("Nombre en mayusculas: ").append(mayuscula);
            JOptionPane.showMessageDialog(null, sb.toString());
        }else {
            JOptionPane.showMessageDialog(null, "El dato ingresado no es una cadena, por favor solo letras");
        }
        
    }
}
