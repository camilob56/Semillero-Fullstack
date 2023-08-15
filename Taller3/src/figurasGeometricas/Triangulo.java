package figurasGeometricas;

public class Triangulo extends FiguraBidimensional {
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
        public double calcularArea() {
        return Math.round((base * altura / 2) * 100.0) / 100.0;
    }

    @Override   
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Perímetro no es aplicable para esta figura");
    }

    public double calcularTeoremaPitagoras(double a, double b) {
        return Math.round(Math.sqrt(a * a + b * b) * 100.0) / 100.0;
    }
    



}
