package figurasLienzo;

public class Cuadrados extends Figura{

    public Cuadrados(String color) {
        super(color);
    }

    @Override
    public String dibujar() {
        return "Dibujando un cuadrado de color " + getColor();
    }
    
}
