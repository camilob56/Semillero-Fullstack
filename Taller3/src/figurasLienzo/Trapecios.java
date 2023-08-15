package figurasLienzo;

public class Trapecios extends Figura {

    public Trapecios(String color) {
        super(color);
    }

    @Override
    public String dibujar() {
        return "Dibujando un trapecio de color " + getColor();
    }
    
}
