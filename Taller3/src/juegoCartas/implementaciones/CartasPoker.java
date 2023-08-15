package juegoCartas.implementaciones;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import juegoCartas.contratos.CartaBase;

public class CartasPoker extends CartaBase {
    public CartasPoker(String palo, int valor) {
        super(palo, valor);
    }

    public void mostrarCarta() {
        JOptionPane.showMessageDialog(null, "La carta que selecciono es: " + valor + " de " + palo);
    }

    public int valorNumerico() {
        return (int) (Math.random() * 13) + 1;
    }
    

    public static List<CartasPoker> crearBaraja() {
        String[] palos = {"Corazones", "Diamantes", "Picas", "Tréboles"};
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        List<CartasPoker> baraja = new ArrayList<>();

        for (String palo : palos) {
            for (int valor : valores) {
                baraja.add(new CartasPoker(palo, valor));
            }
        }

        return baraja;
    }


    public static void mostrarBaraja(List<CartasPoker> baraja) {
        StringBuilder sb = new StringBuilder();
        String[] palos = {"Corazones", "Diamantes", "Picas", "Tréboles"};
    
        for (String palo : palos) {
            sb.append(palo).append(": ");
            List<String> cartasEnPalo = new ArrayList<>();
            
            for (CartasPoker carta : baraja) {
                if (carta.palo.equals(palo)) {
                    cartasEnPalo.add(carta.valor + " de " + carta.palo);
                }
            }
            
            sb.append(String.join(", ", cartasEnPalo)).append("\n");
        }
    
        JOptionPane.showMessageDialog(null, sb.toString(), "Baraja de Cartas", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    



}

