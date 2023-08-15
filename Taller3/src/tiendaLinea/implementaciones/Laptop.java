package tiendaLinea.implementaciones;

import tiendaLinea.contratos.Electronica;

public class Laptop extends Electronica {
    private String sistemaOperativo;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public Laptop(String marca, double precio, String modelo, String sistemaOperativo) {
        super(marca, precio, modelo);
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
    }
}