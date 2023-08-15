package formasGeometricas;

public class Circulo extends FormaBidimensional{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * radio * radio;
        return Math.round(area * 100.0) / 100.0;
    }
}
