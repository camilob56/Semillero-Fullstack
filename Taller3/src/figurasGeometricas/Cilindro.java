package figurasGeometricas;

public class Cilindro extends FiguraTridimensional {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura){
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * radio * radio + 2 * Math.PI * radio * altura;
    }


    @Override
    public double calcularVolumen() {
        return Math.PI * radio * radio * altura;
    }

}
