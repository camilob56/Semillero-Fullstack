package figurasGeometricas;

abstract public class FiguraBidimensional extends Figura {
    public FiguraBidimensional(String nombre) {
        super(nombre);
    }

    public abstract double calcularPerimetro();

}
