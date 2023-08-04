import javax.swing.JOptionPane;

public class App7 {
    public static void main(String[] args) {
        // 7. 
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número entero positivo"));
        if (num1 > 0) {
            String tablasMultiplicar = "";
            for (int i = 1; i <= 10; i++) {
                int resultado = num1 * i;
                tablasMultiplicar += num1 + " * " + i + " = " + resultado + "\n";
            }
            JOptionPane.showMessageDialog(null, "Tablas de multiplicar del numero ingresado (" + num1 + "):\n\n" + tablasMultiplicar);
        } else {
            JOptionPane.showMessageDialog(null, "El programa no admite numeros negativos");
        }
    }
}

