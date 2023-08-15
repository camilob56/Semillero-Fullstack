package tiendaLinea.implementaciones;

import tiendaLinea.contratos.Lectura;

public class LibroTexto extends Lectura {
    private String tema;

    public LibroTexto(String titulo, double precio, String autor, String tema) {
        super(titulo, precio, autor);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
    }
}
