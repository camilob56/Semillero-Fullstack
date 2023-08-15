package instrumentosMusicales;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Instrumento[] instrumentos = new Instrumento[6];
        instrumentos[0] = new Guitarras("Guitarra Acustica", "Cuerdas");
        instrumentos[1] = new Violines("Violín Stradivarius", "Cuerdas");
        instrumentos[2] = new Pianos("Piano de Cola", "Teclado");
        instrumentos[3] = new Guitarras("Guitarra Eléctrica", "Cuerdas");
        instrumentos[4] = new Violines("Violín Amati", "Cuerdas");
        instrumentos[5] = new Pianos("Piano Digital", "Teclado");

        tocarTodos(instrumentos);
    }

    public static void tocarTodos(Instrumento[] instrumentos) {
        StringBuilder mensaje = new StringBuilder("Tocando los instrumentos:\n");

        for (Instrumento instrumento : instrumentos) {
            mensaje.append("- ").append(instrumento.tocar());
            instrumento.tocar();
            mensaje.append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
