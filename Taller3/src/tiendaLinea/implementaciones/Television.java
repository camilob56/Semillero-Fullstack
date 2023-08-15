package tiendaLinea.implementaciones;

import tiendaLinea.contratos.Electronica;

public class Television extends Electronica {
    private String tipoPantalla;

    public Television(String marca, double precio, String modelo, String tipoPantalla) {
        super(marca, precio, modelo);
        this.tipoPantalla = tipoPantalla;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }
}
