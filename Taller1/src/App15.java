import javax.swing.JOptionPane;

public class App15 {
    public static void main(String[] args) {
        // 15.
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero entero positivo"));
        if (num1 > 0) {
            String numeroStr = String.valueOf(num1);
            boolean esCapicua = true;
            int longitud = numeroStr.length();

            for (int i = 0; i < longitud / 2; i++) {
                if (numeroStr.charAt(i) != numeroStr.charAt(longitud - 1 - i)) {
                    esCapicua = false;
                    break;
                }
            }

            if (esCapicua) {
                JOptionPane.showMessageDialog(null, "El numero " + num1 + " es capicúa");
            } else {
                JOptionPane.showMessageDialog(null, "El numero " + num1 + " no es capicúa");
            }

        }else {
                JOptionPane.showMessageDialog(null, "El numero ingresado es negativo");
        }
    }
}
