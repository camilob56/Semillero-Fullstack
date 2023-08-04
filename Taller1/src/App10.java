import javax.swing.JOptionPane;

public class App10 {
    public static void main(String[] args) {
        // 10.
        int num1 = 20;
        StringBuilder serie = new StringBuilder();

        for (int i = 0; i < num1; i++) {
            serie.append(fibonacci(i)).append(" ");
        }

        JOptionPane.showMessageDialog(null, "Serie de Fibonacci de " + num1 + " términos:\n" + serie.toString());
    }

    public static int fibonacci(int numero) {
        
        if (numero == 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
        
    }
}
