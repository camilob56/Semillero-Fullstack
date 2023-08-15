package instrumentosMusicales;

public class Guitarras extends Instrumento {
    
    public Guitarras(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public String tocar() {
        return "Tocando la guitarra...  " + getNombre();
    }
}
