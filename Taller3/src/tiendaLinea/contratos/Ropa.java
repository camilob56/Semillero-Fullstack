package tiendaLinea.contratos;
import javax.swing.JOptionPane;
import tiendaLinea.implementaciones.Camiseta;
import tiendaLinea.implementaciones.Pantalon;
import tiendaLinea.implementaciones.Zapatos;

public abstract class Ropa implements Producto {
    protected String tipo;
    protected double precio;
    protected String talla;

    public Ropa(String tipo, double precio, String talla) {
        this.tipo = tipo;
        this.precio = precio;
        this.talla = talla;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
    String detalles = "Tipo: " + tipo + "\n" +
                    "Precio: " + precio + "\n" +
                    "Talla: " + talla;

        if (this instanceof Camiseta) {
            detalles += "\n" + "Color de camiseta: " + ((Camiseta) this).getColor();
        }else if (this instanceof Pantalon){
            detalles += "\n" + "Estilo de pantalon: " + ((Pantalon) this).getEstilo();
        }else if(this instanceof Zapatos){
            detalles += "\n" + "Material de zapatos: " + ((Zapatos) this).getMaterial();
        }

        JOptionPane.showMessageDialog(null, detalles);
    }

}