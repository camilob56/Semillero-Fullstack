package sistemaNotificaciones;
import javax.swing.JOptionPane;
import sistemaNotificaciones.implementaciones.CorreosElectronicos;
import sistemaNotificaciones.implementaciones.MensajesdeTexto;
import sistemaNotificaciones.implementaciones.NotificacionesPush;

public class App {
    public static void main(String[] args) {

        mostrarMenu();
    }



    public static void mostrarMenu() {

        String[] opciones = {"Correos Electronicos", "Mensajes de texto", "Notificaciones Push", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(null,"Seleccione el tipo de notificacion a enviar:","Menú de mensajes",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);

        switch(seleccion){
            case 0:
            String direccion = JOptionPane.showInputDialog("Por favor ingrese la direccion de correo electronico: ");
            String mensaje = JOptionPane.showInputDialog("Por favor ingrese el mensaje: ");
            CorreosElectronicos correo = new CorreosElectronicos(direccion, mensaje);
            correo.enviar();      
            break;

            case 1:
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Por el numero telefonico a enviar el mensaje de texto: "));
            mensaje = JOptionPane.showInputDialog("Por favor ingrese el mensaje: ");
            MensajesdeTexto mensajeTexto = new MensajesdeTexto(numero, mensaje);
            mensajeTexto.enviar();
            break;

            case 2:
            String dispositivo = JOptionPane.showInputDialog("Por favor ingrese a el dispositivo que enviara la notificacion push: ");
            mensaje = JOptionPane.showInputDialog("Por favor ingrese el mensaje: ");
            NotificacionesPush notificacionPush = new NotificacionesPush(dispositivo, mensaje);
            notificacionPush.enviar();
            break;

            default:
                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
            break;
        }

    }

}
