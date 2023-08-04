import javax.swing.JOptionPane;

public class App11 {
    public static void main(String[] args) {
        // 11.
        JOptionPane.showMessageDialog(null, "Por favor ingrese las longitudes de los tres lados");
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado"));
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado"));
        double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer lado"));          
        if(lado1 > 0 && lado2 > 0 && lado3 > 0){
            double s = (lado1+lado2+lado3)/2;
            double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
            JOptionPane.showMessageDialog(null, "El área del triangulo es: " + area);
        }else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese datos validos valores positivos");
        }
        

    }
}
