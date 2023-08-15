package figurasGeometricas;

public class Rectangulo extends FiguraBidimensional {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return Math.round((base * altura) * 100.0) / 100.0;
    }

    @Override
    public double calcularPerimetro() {
        return Math.round((2 * (base + altura)) * 100.0) / 100.0;
    }


}
