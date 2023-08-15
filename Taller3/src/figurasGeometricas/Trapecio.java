package figurasGeometricas;

public class Trapecio extends FiguraBidimensional {
    private double base1;
    private double base2;
    private double altura;

    public Trapecio(double base1, double base2, double altura){
        super("Trapecio");
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return Math.round((((base1 + base2) * altura) / 2) * 100.0) / 100.0;
    }

    @Override   
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Perímetro no es aplicable para esta figura");
    }

    
}
