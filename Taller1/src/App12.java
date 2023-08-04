import javax.swing.JOptionPane;

public class App12 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número entero"));
        boolean primo = true;

        if (num1 == 2) {
            primo = true;
        } else if (num1 % 2 == 0 || num1 == 1) {
            primo = false;
        } else {
            for (int i = 3; i * i <= num1; i += 2) {
                if (num1 % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo)
            JOptionPane.showMessageDialog(null, "El numero: " + num1 + " es primo");
        else
            JOptionPane.showMessageDialog(null, "El numero: " + num1 + " no es primo");
    }
}

