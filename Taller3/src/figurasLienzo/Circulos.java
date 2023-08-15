package figurasLienzo;

public class Circulos extends Figura {

    public Circulos(String color) {
        super(color);
    }

    @Override
    public String dibujar() {
        return "Dibujando un círculo de color " + getColor();
    }
    
}
