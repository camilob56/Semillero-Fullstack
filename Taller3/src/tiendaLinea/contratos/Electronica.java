package tiendaLinea.contratos;

import javax.swing.JOptionPane;

import tiendaLinea.implementaciones.Smartphone;
import tiendaLinea.implementaciones.Television;
import tiendaLinea.implementaciones.Laptop;

public abstract class Electronica implements Producto {
    protected String marca;
    protected double precio;
    protected String modelo;

    public Electronica(String marca, double precio, String modelo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
    String detalles = "Marca: " + marca + "\n" +
                    "Precio: " + precio + "\n" +
                    "Modelo: " + modelo;

        if (this instanceof Smartphone) {
            detalles += "\n" + "Sistema operativo: " + ((Smartphone) this).getSistemaOperativo();
        }else if(this instanceof Laptop) {
            detalles += "\n" + "Sistema operativo: " + ((Laptop) this).getSistemaOperativo();
        }else if(this instanceof Television){
            detalles += "\n" + "Tipo de pantalla: " + ((Television) this).getTipoPantalla();
        }

        JOptionPane.showMessageDialog(null, detalles);
    }

}