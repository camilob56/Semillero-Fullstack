import javax.swing.JOptionPane;

public class App2 {
    public static void main(String[] args){
        // 2.
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número entero"));
        int operacion = num1%2;
        String resultado = (operacion == 0) ? "El numero: " + num1 + " es PAR" : "El numero: " + num1 + " es IMPAR";
        JOptionPane.showMessageDialog(null, resultado);
        
    }
}
