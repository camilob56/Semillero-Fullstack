package ReservaHotel;

import javax.swing.JOptionPane;

public class SistemaHotel {
    public static void main(String[] args) {
        mostrarMenuInicial();
    }
    
    public static void mostrarMenuInicial() {
        Hotel[] hoteles = Hotel.crearHoteles();
        String[] opciones = { "Ver hoteles", "Ver reservas", "Salir" };
        int seleccion = JOptionPane.showOptionDialog(null,"Seleccione que accion desea realizar","Sistema de reservas de hoteles",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]
        );
        
        if (seleccion == 0) {
            Hotel.mostrarHoteles(hoteles);
        } else if (seleccion == 1) {
            //Hotel.mostrarReservasRealizadas();
        }else {
            JOptionPane.showMessageDialog(null, "Ha salido del programa");
        }
    }
}

