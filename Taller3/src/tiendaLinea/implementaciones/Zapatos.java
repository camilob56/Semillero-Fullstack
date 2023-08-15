package tiendaLinea.implementaciones;

import tiendaLinea.contratos.Ropa;

public class Zapatos extends Ropa{
    private String material;

    public Zapatos(String tipo, double precio, String talla, String material) {
        super(tipo, precio, talla);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
    }
}