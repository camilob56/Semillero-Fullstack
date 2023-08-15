package tiendaLinea.implementaciones;

import tiendaLinea.contratos.Lectura;

public class Novela extends Lectura {
    private int numeroPaginas;

    public Novela(String titulo, double precio, String autor, int numeroPaginas) {
        super(titulo, precio, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
    }
}