import javax.swing.JOptionPane;

public class App6 {
    public static void main(String[] args) {
        // 6.
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número entero"));
        if(num1==0){
            JOptionPane.showMessageDialog(null, "El numero ingresado es cero: 0");
        }else if (num1>0){
            JOptionPane.showMessageDialog(null, "El numero ingresado es positivo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero ingresado es negativo");
        }
        
    }

}
