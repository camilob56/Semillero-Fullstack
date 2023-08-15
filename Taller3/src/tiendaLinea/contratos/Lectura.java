package tiendaLinea.contratos;
import javax.swing.JOptionPane;

import tiendaLinea.implementaciones.Biografia;
import tiendaLinea.implementaciones.Novela;
import tiendaLinea.implementaciones.LibroTexto;

public abstract class Lectura implements Producto {
    protected String titulo;
    protected double precio;
    protected String autor;

    public Lectura(String titulo, double precio, String autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
    String detalles = "Titulo: " + titulo + "\n" +
                    "Precio: " + precio + "\n" +
                    "Autor: " + autor;

        if (this instanceof Novela) {
            detalles += "\n" + "Numero de paginas: " + ((Novela) this).getNumeroPaginas();
        }else if (this instanceof Biografia){
            detalles += "\n" + "El personaje principal es: " + ((Biografia) this).getPersonajePrincipal();
        }else if (this instanceof LibroTexto){
            detalles += "\n" + "El personaje principal es: " + ((LibroTexto) this).getTema();
        }

        JOptionPane.showMessageDialog(null, detalles);
    }
}
