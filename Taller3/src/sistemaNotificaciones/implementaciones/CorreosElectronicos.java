package sistemaNotificaciones.implementaciones;

import javax.swing.JOptionPane;

import sistemaNotificaciones.contratos.Mensaje;

public class CorreosElectronicos implements Mensaje {
    private String direccionCorreo;
    private String mensaje;

    public CorreosElectronicos(String direccionCorreo, String mensaje) {
        this.direccionCorreo = direccionCorreo;
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        String mensajeEnviado = "Correo electronico enviado a: " + "\n" + direccionCorreo + "\n" + "Mensaje: " + "\n" + mensaje;
        JOptionPane.showMessageDialog(null, mensajeEnviado, "Envío de Correo Electrónico", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
