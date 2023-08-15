package figurasGeometricas;

public class Cuadrado extends FiguraBidimensional{
    private double base;
    private double altura;

    public Cuadrado(double base, double altura){
        super("Cuadrado");
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
