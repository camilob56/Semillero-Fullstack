package empleadossSalarios;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[6];
        empleados[0] = new PorQuincena("Juan", "Perez", "123456", 600.000);
        empleados[1] = new PorHoras("Maria", "Gomez", "789012", 40, 12.000);
        empleados[2] = new PorMes("Carlos", "Lopez", "345678", 2000);
        empleados[3] = new PorHoras("Ana", "Martinez", "456789", 35, 15.000);
        empleados[4] = new PorQuincena("Pedro", "Ramirez", "987654", 790.000);
        empleados[5] = new PorMes("Laura", "Hernandez", "567890", 1.800000);

        StringBuilder sb = new StringBuilder();

        for (Empleado empleado : empleados) {
            sb.append("Tipo de empleado: ").append(empleado.getClass().getSimpleName()).append("\n");
            sb.append("Nombre: ").append(empleado.getNombre()).append(" ").append(empleado.getApellido()).append("\n");
            sb.append("Número de seguro social: ").append(empleado.getNumeroSeguroSocial()).append("\n");
            sb.append("Pago: ").append(empleado.calcularPago()).append("\n");
            sb.append("------------------------------------------").append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Informacion de Empleados", JOptionPane.INFORMATION_MESSAGE);


    }
}
