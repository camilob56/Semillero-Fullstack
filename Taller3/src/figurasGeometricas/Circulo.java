package figurasGeometricas;

public class Circulo extends FiguraBidimensional {
    private double radio;

    public Circulo(double radio){
        super("Circulo");
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.round(Math.PI * Math.pow(radio, 2) * 100) / 100.0;
    }


    @Override   
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Perímetro no es aplicable para esta figura");
    }

    public double calcularCircunferencia() {
        return Math.round((2 * Math.PI * radio) * 100.0) / 100.0;
    }
    

}

