import javax.swing.JOptionPane;

public class App23 {
    public static void main(String[] args) {
        String oracion = JOptionPane.showInputDialog("Por favor ingresa una oracion");
        if (oracion.matches("[a-zA-Z\\s]+")) {
            String[] palabras = oracion.split("\\s+");
            int cont = palabras.length;
            JOptionPane.showMessageDialog(null, "La oracion: " + oracion + " contiene: " + cont + "palabras");
        }else {
            JOptionPane.showMessageDialog(null, "El dato ingresado no es una oracion, por favor solo letras");
        }
    }
}
