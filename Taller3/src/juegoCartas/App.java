package juegoCartas;

import java.util.List;

import javax.swing.JOptionPane;

import juegoCartas.implementaciones.CartasEspanolas;
import juegoCartas.implementaciones.CartasFrancesas;
import juegoCartas.implementaciones.CartasPoker;

public class App {
    public static void main(String[] args) {
        mostrarMenu();
    }


    public static void mostrarMenu() {
        String[] opciones = {"Baraja Poker", "Baraja Francesa", "Baraja Española", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(null,"Seleccione el tipo de baraja:","Menú de tipos de barajas",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);

        switch(seleccion){
            case 0:
            List<CartasPoker> baraja = CartasPoker.crearBaraja();
            CartasPoker.mostrarBaraja(baraja);
            String[] opciones1 = {"Ver una carta", "valor numerico", "Salir"};
            int seleccion1 = JOptionPane.showOptionDialog(null,"Seleccione accion:","Menú de barajas",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones1,opciones1[0]);
            switch(seleccion1){
                case 0:
                String palo = JOptionPane.showInputDialog("Por favor ingrese el palo de la carta: ");
                palo = palo.toLowerCase();
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Por ingrese el valor de la carta: "));
                CartasPoker carta = new CartasPoker(palo, valor);
                carta.mostrarCarta();
                break;

                case 1:
                palo = JOptionPane.showInputDialog("Por favor ingrese el palo de la carta: ");
                palo = palo.toLowerCase();
                carta = new CartasPoker(palo, 0);
                valor = carta.valorNumerico();
                carta = new CartasPoker(palo, valor);
                carta.mostrarCarta();
                break;

                default:
                    JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                break;
            }
            break;

            case 1:
            List<CartasFrancesas> baraja1 = CartasFrancesas.crearBaraja();
            CartasFrancesas.mostrarBaraja(baraja1);
            String[] opciones2 = {"Ver una carta", "valor numerico", "Salir"};
            int seleccion2 = JOptionPane.showOptionDialog(null, "Seleccione accion:", "Menú de barajas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones2, opciones2[0]);
            switch (seleccion2) {
                case 0:
                String palo = JOptionPane.showInputDialog("Por favor ingrese el palo de la carta: ");
                palo = palo.toLowerCase();
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Por ingrese el valor de la carta: "));
                CartasFrancesas carta = new CartasFrancesas(palo, valor);
                carta.mostrarCarta();
                break;

                case 1:
                palo = JOptionPane.showInputDialog("Por favor ingrese el palo de la carta: ");
                palo = palo.toLowerCase();
                carta = new CartasFrancesas(palo, 0);
                valor = carta.valorNumerico();
                carta = new CartasFrancesas(palo, valor);
                carta.mostrarCarta();
                break;

                default:
                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                break;
            }
            break;

            case 2:
            List<CartasEspanolas> baraja2 = CartasEspanolas.crearBaraja();
            CartasEspanolas.mostrarBaraja(baraja2);
            String[] opciones3 = {"Ver una carta", "valor numerico", "Salir"};
            int seleccion3 = JOptionPane.showOptionDialog(null, "Seleccione accion:", "Menú de barajas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones3, opciones3[0]);
            switch (seleccion3) {
                case 0:
                String palo = JOptionPane.showInputDialog("Por favor ingrese el palo de la carta: ");
                palo = palo.toLowerCase();
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Por ingrese el valor de la carta: "));
                CartasEspanolas carta = new CartasEspanolas(palo, valor);
                carta.mostrarCarta();
                break;

                case 1:
                palo = JOptionPane.showInputDialog("Por favor ingrese el palo de la carta: ");
                palo = palo.toLowerCase();
                carta = new CartasEspanolas(palo, 0);
                valor = carta.valorNumerico();
                carta = new CartasEspanolas(palo, valor);
                carta.mostrarCarta();
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
