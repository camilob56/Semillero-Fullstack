package figurasLienzo;

public class Rectangulos extends Figura{

    public Rectangulos(String color) {
        super(color);
    }

    @Override
    public String dibujar() {
        return "Dibujando un rectangulo de color " + getColor();
    }
    
}
