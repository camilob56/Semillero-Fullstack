import javax.swing.JOptionPane;

public class App32 {
    public static void main(String[] args) {
        // 32.
        int[] numeros = {2, 43, 286, 4, 12, 6, 11, 23, 43};
        int buscar = 1;
        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == buscar) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "El numero " + buscar + " ha sido encontrado en el arreglo.");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + buscar + " no ha sido encontrado en el arreglo.");
        }
    }
}
