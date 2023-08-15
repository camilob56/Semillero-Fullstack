package tiendaLinea.implementaciones;

import tiendaLinea.contratos.Lectura;

public class Biografia extends Lectura {
    private String personajePrincipal;

    public Biografia(String titulo, double precio, String autor, String personajePrincipal) {
        super(titulo, precio, autor);
        this.personajePrincipal = personajePrincipal;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
    }

    public String getPersonajePrincipal() {
        return personajePrincipal;
    }
}