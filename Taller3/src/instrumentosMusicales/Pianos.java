package instrumentosMusicales;

public class Pianos extends Instrumento {

    public Pianos(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public String tocar() {
        return "Presionando las teclas del piano...  " + getNombre();
    }

}