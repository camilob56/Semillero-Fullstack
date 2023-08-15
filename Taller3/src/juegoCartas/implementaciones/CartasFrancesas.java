package juegoCartas.implementaciones;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import juegoCartas.contratos.CartaBase;

public class CartasFrancesas extends CartaBase {
    public CartasFrancesas(String palo, int valor) {
        super(palo, valor);
    }

    public void mostrarCarta() {
        JOptionPane.showMessageDialog(null, "La carta que seleccionó es: " + valor + " de " + palo);
    }

    public int valorNumerico() {
        return (int) (Math.random() * 13) + 1;
    }

    public static List<CartasFrancesas> crearBaraja() {
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        List<CartasFrancesas> baraja = new ArrayList<>();

        for (String palo : palos) {
            for (int valor : valores) {
                baraja.add(new CartasFrancesas(palo, valor));
            }
        }

        return baraja;
    }

    public static void mostrarBaraja(List<CartasFrancesas> baraja) {
        StringBuilder sb = new StringBuilder();
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
    
        for (String palo : palos) {
            sb.append(palo).append(": ");
            List<String> cartasEnPalo = new ArrayList<>();
            
            for (CartasFrancesas carta : baraja) {
                if (carta.palo.equals(palo)) {
                    cartasEnPalo.add(carta.valor + " de " + carta.palo);
                }
            }
            
            sb.append(String.join(", ", cartasEnPalo)).append("\n");
        }
    
        JOptionPane.showMessageDialog(null, sb.toString(), "Baraja de Cartas", JOptionPane.INFORMATION_MESSAGE);
    }
}
