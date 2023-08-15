package figurasLienzo;

import javax.swing.JOptionPane;

public class Lienzo {
    private Dibujable[] figuras;

    public Lienzo(Dibujable[] figuras) {
        this.figuras = figuras;
    }

    public void dibujarTodo() {
    StringBuilder mensaje = new StringBuilder("Dibujando en el lienzo:\n");
    for (Dibujable figura : figuras) {
        mensaje.append(figura.dibujar()).append("\n");
    }
    JOptionPane.showMessageDialog(null, mensaje.toString());
}

}
