package formasGeometricas;

public class Rectangulo extends FormaBidimensional{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = base * altura;
        return Math.round(area * 100.0) / 100.0;
    }
}
