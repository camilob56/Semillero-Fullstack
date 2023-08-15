package formasGeometricas;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        Forma[] formas = new Forma[3];
        formas[0] = new Circulo(4.1);
        formas[1] = new Rectangulo(3.2, 7.0);
        formas[2] = new Triangulo(5.0, 8.2);

        StringBuilder resultados = new StringBuilder();
        for (Forma forma : formas) {
            double area = forma.calcularArea();
            resultados.append("Area de la forma: ").append(area).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultados.toString(), "Areas de las Formas: ", JOptionPane.PLAIN_MESSAGE);


    }
}
