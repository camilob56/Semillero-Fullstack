import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class App13 {
    public static void main(String[] args) {
        // 13.
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingresa un numero decimal"));
        if (num1 % 1 == 0 || num1<0) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos verifica que el numero no sea entero o negativo");
        }else{
            BigDecimal redondeo = BigDecimal.valueOf(num1).setScale(2, RoundingMode.HALF_UP);
            JOptionPane.showMessageDialog(null, "El numero: " + num1 + " redondeado: " + redondeo);
        }
    }
}
