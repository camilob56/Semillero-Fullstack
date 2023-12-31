package instrumentosMusicales;

public abstract class Instrumento {
    private String nombre;
    private String tipo;

    public Instrumento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public abstract String tocar();

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}
