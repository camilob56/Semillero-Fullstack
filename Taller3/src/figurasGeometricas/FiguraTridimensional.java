package figurasGeometricas;

abstract public class FiguraTridimensional extends Figura {
    public FiguraTridimensional(String nombre) {
        super(nombre);
    }

    public abstract double calcularVolumen();
}
