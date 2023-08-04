import javax.swing.JOptionPane;

public class App3 {
    public static void main(String[] args) {
        // 3.
        float radio = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese el radio del círculo"));
        float area = (float) (Math.PI * (radio * radio));
        float perimetro = (float) (2 * Math.PI * radio);
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);
        JOptionPane.showMessageDialog(null, "El perímetro del círculo es: " + perimetro);
    }
}
