package sistemaNotificaciones.implementaciones;

import javax.swing.JOptionPane;

import sistemaNotificaciones.contratos.Mensaje;

public class MensajesdeTexto implements Mensaje{
    private int numero;
    private String mensaje;

    public MensajesdeTexto(int numero, String mensaje) {
        this.numero = numero;
        this.mensaje = mensaje;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        String mensajeEnviado = "Mensaje de texto enviado a: " + "\n" + numero + "\n" + "Mensaje: " + "\n" + mensaje;
        JOptionPane.showMessageDialog(null, mensajeEnviado, "Envío de Correo Electrónico", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
