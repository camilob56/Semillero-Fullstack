package animalesSonidos;
import javax.swing.JOptionPane;
import animalesSonidos.implementaciones.Animal;
import animalesSonidos.implementaciones.Canario;
import animalesSonidos.implementaciones.Gato;
import animalesSonidos.implementaciones.Loro;
import animalesSonidos.implementaciones.Perro;

public class App {
    public static void main(String[] args) {
        mostrarMenu();
    }



    public static void mostrarMenu() {
        String[] opciones = {"Perro", "Gato", "Canario", "Loro", "Todos los animales", "Salir"};
        
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el animal:", "Menú de animales", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            
            switch (seleccion) {
                // perro
                case 0:
                    Perro perro = new Perro("Max", "Labrador Retriever");
                    String sonidoPerro = perro.hacerSonido();
                    JOptionPane.showMessageDialog(null, sonidoPerro, "Sonido de Perro", JOptionPane.PLAIN_MESSAGE);
                break;
                // Gato
                case 1:
                    Gato gato = new Gato("Luna", "Persa");
                    String sonidoGato = gato.hacerSonido();
                    JOptionPane.showMessageDialog(null, sonidoGato, "Sonido de Gato", JOptionPane.PLAIN_MESSAGE);
                break;
                // Canario
                case 2:
                    Canario piolin = new Canario("Piolin", "Canario Roller");
                    String sonidoCanario = piolin.hacerSonido();
                    JOptionPane.showMessageDialog(null, sonidoCanario, "Sonido de Canario", JOptionPane.PLAIN_MESSAGE);
                break;
                // Loro
                case 3:
                Loro loro = new Loro("Rocky", "Loro Gris Africano");
                String sonidoLoro = loro.hacerSonido();
                JOptionPane.showMessageDialog(null, sonidoLoro, "Sonido de Loro", JOptionPane.PLAIN_MESSAGE);
                break;
                // all animales
                case 4:
                    Animal[] animales = new Animal[4];
                    animales[0] = new Perro("Max", "Labrador Retriever");
                    animales[1] = new Gato("Luna", "Persa");
                    animales[2] = new Canario("Piolin", "Canario Roller");
                    animales[3] = new Loro("Rocky", "Loro Gris Africano");
    
                    StringBuilder sonidoAnimales = new StringBuilder();

                    for (Animal animal : animales) {
                        sonidoAnimales.append(animal.getClass().getSimpleName())
                        .append(": ");
                        sonidoAnimales.append(animal.hacerSonido())
                        .append("\n");
                    }

                    JOptionPane.showMessageDialog(null, sonidoAnimales.toString(), "Sonidos de Animales", JOptionPane.PLAIN_MESSAGE);
    
                break;

                // Salir
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                    return; 
            }
        }
    }
    




}
