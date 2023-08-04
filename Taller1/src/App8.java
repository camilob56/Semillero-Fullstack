import javax.swing.JOptionPane;

public class App8 {
    public static void main(String[] args) {
        // 8.
        while (true) {
            int numeroAleatorio = (int) (Math.random() * 100) + 1;

            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número entero"));

            if (num1 == numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Felicidades acertaste el numero, Ingresado: " + num1 + " Aleatorio: " + numeroAleatorio);
                break;
            } else if (num1 > numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Vuelve a intentarlo, el numero es MAYOR Ingresado: " + num1 + " Aleatorio: " + numeroAleatorio);
            } else {
                JOptionPane.showMessageDialog(null, "Vuelve a intentarlo, el numero es MENOR Ingresado: " + num1 + " Aleatorio: " + numeroAleatorio);
            }
        }
    }
}
