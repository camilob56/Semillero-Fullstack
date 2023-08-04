import javax.swing.JOptionPane;

public class App21 {
    public static void main(String[] args) {
        // 21. 
        String cadena = JOptionPane.showInputDialog("Por favor ingresa una cadena de texto");
        String letra = JOptionPane.showInputDialog("Ingrese la letra que quiere buscar las veces que se repite");
        if(cadena.matches("[a-zA-Z\\s]+")){
            char letraBuscar = letra.charAt(0);
            int contador = 0;
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == letraBuscar) {
                    contador++;
                }
            }
            
            JOptionPane.showMessageDialog(null, "La letra: " + letraBuscar + " se repite " + contador + " veces en la cadena de texto");
        }else{
            JOptionPane.showMessageDialog(null, "El dato ingresado no es una cadena, por favor solo letras");
        }
    }
}
