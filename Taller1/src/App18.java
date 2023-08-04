import javax.swing.JOptionPane;

public class App18 {
    public static void main(String[] args) {
        int longitud = 8;
        String contenido = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        int recorrerContenido = contenido.length();

        for (int i = 0; i < longitud; i++) {
            int indice = (int) (Math.random() * recorrerContenido);
            char caracter = contenido.charAt(indice);
            sb.append(caracter);
        }

        sb.toString();
        JOptionPane.showMessageDialog(null, "Tu contraseña generada es: " + sb);

    }

}   

