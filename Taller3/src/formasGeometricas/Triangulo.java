package formasGeometricas;

public class Triangulo extends FormaBidimensional{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = 0.5 * base * altura;
        return Math.round(area * 100.0) / 100.0;
    }
}
