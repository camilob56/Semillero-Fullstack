package sistemaNotificaciones.implementaciones;

import javax.swing.JOptionPane;

import sistemaNotificaciones.contratos.Mensaje;

public class NotificacionesPush implements Mensaje{
    
    private String dispositivo;
    private String mensaje;

    public NotificacionesPush(String dispositivo, String mensaje) {
        this.dispositivo = dispositivo;
        this.mensaje = mensaje;
    }


    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }


    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


    @Override
    public void enviar() {
        String mensajeEnviado = "Notificacion push enviada a: " + "\n" + dispositivo + "\n" + "Mensaje: " + "\n" + mensaje;
        JOptionPane.showMessageDialog(null, mensajeEnviado, "Envío de Correo Electrónico", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
