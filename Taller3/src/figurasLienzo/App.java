package figurasLienzo;

public class App {
    public static void main(String[] args) {
        
        Circulos circulo1 = new Circulos("Rojo");
        Cuadrados cuadrado1 = new Cuadrados("Negro");
        Rectangulos rectangulo1 = new Rectangulos("Cafe");
        Trapecios trapecio1 = new Trapecios("Amarillo");
        Circulos circulo2 = new Circulos("Verde");
        Cuadrados cuadrado2 = new Cuadrados("Azul");


        Dibujable[] figuras = {circulo1, cuadrado1, rectangulo1, trapecio1, circulo2, cuadrado2};

        Lienzo lienzo = new Lienzo(figuras);
        lienzo.dibujarTodo();

    }
}

