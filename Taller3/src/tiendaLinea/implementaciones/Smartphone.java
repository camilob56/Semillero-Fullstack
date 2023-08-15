package tiendaLinea.implementaciones;

import tiendaLinea.contratos.Electronica;

public class Smartphone extends Electronica {
    private String sistemaOperativo;

    public Smartphone(String marca, double precio, String modelo, String sistemaOperativo) {
        super(marca, precio, modelo);
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
    }
}