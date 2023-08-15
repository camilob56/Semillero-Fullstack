package tiendaLinea.implementaciones;

import tiendaLinea.contratos.Ropa;

public class Camiseta extends Ropa {
    private String color;

    public Camiseta(String tipo, double precio, String talla, String color) {
        super(tipo, precio, talla);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
    }
}