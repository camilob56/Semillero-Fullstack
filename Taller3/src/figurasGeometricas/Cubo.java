package figurasGeometricas;

public class Cubo extends FiguraTridimensional {
    private double lado;

    public Cubo(double lado){
        super("Cubo");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }
}
