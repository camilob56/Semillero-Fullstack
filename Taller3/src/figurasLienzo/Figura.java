package figurasLienzo;

public abstract class Figura implements Dibujable {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    
}
