package tiendaLinea.implementaciones;

import tiendaLinea.contratos.Ropa;

public class Pantalon extends Ropa {
    private String estilo;

    public Pantalon(String tipo, double precio, String talla, String estilo) {
        super(tipo, precio, talla);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
    }
}