package figurasGeometricas;

import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) {
        mostrarMenu();
    }


    public static void mostrarMenu() {
        String[] opciones = {"Círculo", "Triángulo", "Rectángulo", "Cuadrado", "Trapecio", "Cilindro", "Esfera", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(null,"Seleccione la figura geométrica con la que desea trabajar:","Menú de Figuras Geométricas",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);

        switch (seleccion) {
            case 0:
                // Círculo
                String[] opciones2 = {"Calcular Area", "Calcular Circunferencia", "Salir"};
                int seleccion2 = JOptionPane.showOptionDialog(null,"Seleccione la operacion que desea realizar:","Menú de operaciones",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones2,opciones2[0]);
                switch(seleccion2){
                    case 0:
                        double radio = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el radio del circulo: "));
                        Circulo circulo1 = new Circulo(radio);
                        JOptionPane.showMessageDialog(null, "El area del circulo es: " + circulo1.calcularArea());
                        break;
                    case 1:
                        radio = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el radio del circulo: "));
                        circulo1 = new Circulo(radio);
                        JOptionPane.showMessageDialog(null, "La circunferencia es: " + circulo1.calcularCircunferencia());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                        break;
                }
                break;
            case 1:
                // Triángulo
                String[] opciones3 = {"Calcular Area", "Calcular Teorema de pitagoras para triangulos rectangulos", "Salir"};
                int seleccion3 = JOptionPane.showOptionDialog(null,"Seleccione la operacion que desea realizar:","Menú de operaciones",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones3,opciones3[0]);
                switch(seleccion3){
                    case 0:
                        double base = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la base del triangulo: "));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la altura del triangulo: "));
                        Triangulo triangulo1 = new Triangulo(base, altura);
                        JOptionPane.showMessageDialog(null, "El area del triangulo es: " + triangulo1.calcularArea());
                        break;
                    case 1:
                        double cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el cateto a del triangulo: "));
                        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el cateto b del triangulo: "));
                        triangulo1 = new Triangulo(cateto1, cateto2);
                        JOptionPane.showMessageDialog(null, "La hipotenusa del triangulo es: " + triangulo1.calcularTeoremaPitagoras(cateto1, cateto2));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                        break;
                }
                break;
            case 2:
                // Rectángulo
                String[] opciones4 = {"Calcular Area", "Calcular Perimetro", "Salir"};
                int seleccion4 = JOptionPane.showOptionDialog(null,"Seleccione la operacion que desea realizar:","Menú de operaciones",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones4,opciones4[0]);
                switch(seleccion4){
                    case 0:
                        double base = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la base del rectangulo: "));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la altura del rectangulo: "));
                        Rectangulo rectangulo1 = new Rectangulo(base, altura);
                        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + rectangulo1.calcularArea());
                        break;
                    case 1:
                        base = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la base del rectangulo: "));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la altura del rectangulo: "));
                        rectangulo1 = new Rectangulo(base, altura);
                        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: " + rectangulo1.calcularPerimetro());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                        break;
                }
                break;
            case 3:
                // Cuadrado
                String[] opciones5 = {"Calcular Area", "Calcular Perimetro", "Salir"};
                int seleccion5 = JOptionPane.showOptionDialog(null,"Seleccione la operacion que desea realizar:","Menú de operaciones",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones5,opciones5[0]);
                switch(seleccion5){
                    case 0:
                        double base = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la base del cuadrado: "));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la altura del cuadrado: "));
                        Cuadrado cuadrado1 = new Cuadrado(base, altura);
                        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + cuadrado1.calcularArea());
                        break;
                    case 1:
                        base = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la base del cuadrado: "));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la altura del cuadrado: "));
                        cuadrado1 = new Cuadrado(base, altura);
                        JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: " + cuadrado1.calcularPerimetro());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                        break;
                }
                break;
            case 4:
                // Trapecio
                String[] opciones6 = {"Calcular Area", "Salir"};
                int seleccion6 = JOptionPane.showOptionDialog(null,"Seleccione la operacion que desea realizar:","Menú de operaciones",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones6,opciones6[0]);
                switch(seleccion6){
                    case 0:
                        double base1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la base 1 del trapecio: "));
                        double base2 = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la base 2 del trapecio: "));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la altura del trapecio: "));
                        Trapecio trapecio1 = new Trapecio(base1, base2, altura);
                        JOptionPane.showMessageDialog(null, "El area del trapecio es: " + trapecio1.calcularArea());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                        break;
                }
                break;
            case 5:
                // Cilindro
                String[] opciones7 = {"Calcular Area", "Calcular Volumen", "Salir"};
                int seleccion7 = JOptionPane.showOptionDialog(null,"Seleccione la operacion que desea realizar:","Menú de operaciones",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones7,opciones7[0]);
                switch(seleccion7){
                    case 0:
                        double rbase = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el radio de la base del cilindro: "));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la altura del cilindro: "));
                        Cilindro cilindro1 = new Cilindro(rbase, altura);
                        JOptionPane.showMessageDialog(null, "El area de la base del cilindro es: " + cilindro1.calcularArea());
                        break;
                    case 1:
                        rbase = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el radio de la base del cilindro: "));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la altura del cilindro: "));
                        cilindro1 = new Cilindro(rbase, altura);
                        JOptionPane.showMessageDialog(null, "El volumen del cilindro es: " + cilindro1.calcularVolumen());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                        break;
                }
                break;
            case 6:
                // Esfera
                String[] opciones8 = {"Calcular Area", "Calcular Volumen", "Salir"};
                int seleccion8 = JOptionPane.showOptionDialog(null,"Seleccione la operacion que desea realizar:","Menú de operaciones",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones8,opciones8[0]);
                switch(seleccion8){
                    case 0:
                        double radio = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el radio de la esfera: "));
                        Esfera esfera1 = new Esfera(radio);
                        JOptionPane.showMessageDialog(null, "El volumen del cilindro es: " + esfera1.calcularArea());
                        break;
                    case 1:
                        radio = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el radio de la esfera: "));
                        esfera1 = new Esfera(radio);
                        JOptionPane.showMessageDialog(null, "El volumen la esfera es: " + esfera1.calcularVolumen());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                        break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                break;
        }
    }
}
