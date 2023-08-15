package instrumentosMusicales;

public class Violines extends Instrumento {

    public Violines(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public String tocar() {
        return "Tocando el violin...  " + getNombre();
    }

}
