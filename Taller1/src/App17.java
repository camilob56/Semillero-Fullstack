import javax.swing.JOptionPane;

public class App17 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Por favor ingrese el rango en el cual desea ver los numeros primos");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese desde que numero quiere empezar a mostrar el rango"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta que numero quiere que termine el rango"));
        if (num1 > 0 && num2 > 0) {
            if (num1 < num2) {
                StringBuilder primosEncontrados = new StringBuilder();
                primosEncontrados.append("Numeros primos en el rango desde ").append(num1).append(" hasta ").append(num2).append(":\n");

                for (int i = num1; i <= num2; i++) {
                    if (esPrimo(i)) {
                        primosEncontrados.append(i).append(", ");
                    }
                }
            
                if (primosEncontrados.length() > 0) {
                    primosEncontrados.setLength(primosEncontrados.length() - 2);
                }
                JOptionPane.showMessageDialog(null, primosEncontrados.toString());
            } else {
                JOptionPane.showMessageDialog(null, "El rango debe empezar con un número menor y terminar con un número mayor.");
            }

        }else {
            JOptionPane.showMessageDialog(null, "El numero ingresado es negativo");
        }
    }


    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
