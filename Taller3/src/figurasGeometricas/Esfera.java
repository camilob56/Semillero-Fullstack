package figurasGeometricas;

public class Esfera extends FiguraTridimensional {
    private double radio;

    public Esfera(double radio){
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.round(4 * Math.PI * radio * radio * 100.0) / 100.0;
    }

    @Override
    public double calcularVolumen() {
        return Math.round((4.0/3.0) * Math.PI * Math.pow(radio, 3) * 100.0) / 100.0;
    }

}
