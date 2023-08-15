package bancoCuentas;

import javax.swing.JOptionPane;

import bancoCuentas.implementaciones.CuentaAhorro;
import bancoCuentas.implementaciones.CuentaCorriente;
import bancoCuentas.implementaciones.CuentaNomina;

public class App {
    public static void main(String[] args) {
        mostrarMenu();
    }


    public static void mostrarMenu() {
        String[] opciones = {"Cuenta Ahorro", "Cuenta Corriente", "Cuenta de nomina", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(null,"Seleccione el tipo de cuenta bancaria:","Menú de cuentas bancarias",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);

        switch(seleccion){
            case 0:
            String nombreTitular = JOptionPane.showInputDialog("Por favor ingrese el nombre del titular: ");
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Por el numero de cedula: "));
            String direccion = JOptionPane.showInputDialog("Por favor ingrese la direccion: ");
            double depositoInicial = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el depósito inicial de su cuenta: "));
            CuentaAhorro cuentaAhorro = new CuentaAhorro(nombreTitular, cedula, direccion, depositoInicial);

            boolean salir = false;

            while (!salir) {
                String[] opciones2 = {"Ver cuenta", "Retirar saldo", "Depositar saldo", "Salir"};
                int seleccion2 = JOptionPane.showOptionDialog(null, "Seleccione qué acción desea realizar con su cuenta bancaria:", "Menú de acciones en cuenta bancaria", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones2, opciones2[0]);

                switch (seleccion2) {
                case 0:
                JOptionPane.showMessageDialog(null, cuentaAhorro.obtenerInformacion());
                break;

                case 1:
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el saldo a retirar: "));
                    cuentaAhorro.retirar(retiro);
                    String mensajeEnviado = "Monto retirado: " + "\n" + retiro;
                    JOptionPane.showMessageDialog(null, mensajeEnviado, "Transacción exitosa", JOptionPane.INFORMATION_MESSAGE);
                break;

                case 2:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el saldo a depositar: "));
                    cuentaAhorro.depositar(deposito);
                    mensajeEnviado = "Monto depositado: " + "\n" + deposito;
                    JOptionPane.showMessageDialog(null, mensajeEnviado, "Transacción exitosa", JOptionPane.INFORMATION_MESSAGE);
                break;

                default:
                salir = true;
                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                break;
        
                }
            }
            break;


            case 1:
            nombreTitular = JOptionPane.showInputDialog("Por favor ingrese el nombre del titular: ");
            cedula = Integer.parseInt(JOptionPane.showInputDialog("Por el numero de cedula: "));
            direccion = JOptionPane.showInputDialog("Por favor ingrese la direccion: ");
            depositoInicial = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el depósito inicial de su cuenta: "));
            CuentaCorriente cuentaCorriente = new CuentaCorriente(nombreTitular, cedula, direccion, depositoInicial);

            salir = false;

            while (!salir) {
                String[] opciones2 = {"Ver cuenta", "Retirar saldo", "Depositar saldo", "Salir"};
                int seleccion2 = JOptionPane.showOptionDialog(null, "Seleccione qué acción desea realizar con su cuenta bancaria:", "Menú de acciones en cuenta bancaria", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones2, opciones2[0]);

                switch (seleccion2) {
                case 0:
                JOptionPane.showMessageDialog(null, cuentaCorriente.obtenerInformacion());
                break;

                case 1:
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el saldo a retirar: "));
                    cuentaCorriente.retirar(retiro);
                    String mensajeEnviado = "Monto retirado: " + "\n" + retiro;
                    JOptionPane.showMessageDialog(null, mensajeEnviado, "Transacción exitosa", JOptionPane.INFORMATION_MESSAGE);
                break;

                case 2:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el saldo a depositar: "));
                    cuentaCorriente.depositar(deposito);
                    mensajeEnviado = "Monto depositado: " + "\n" + deposito;
                    JOptionPane.showMessageDialog(null, mensajeEnviado, "Transacción exitosa", JOptionPane.INFORMATION_MESSAGE);
                break;

                default:
                salir = true;
                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                break;
        
                }
            }
            break;

            case 2:
            nombreTitular = JOptionPane.showInputDialog("Por favor ingrese el nombre del titular: ");
            cedula = Integer.parseInt(JOptionPane.showInputDialog("Por el numero de cedula: "));
            direccion = JOptionPane.showInputDialog("Por favor ingrese la direccion: ");
            depositoInicial = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el depósito inicial de su cuenta: "));
            String empresaEmpleadora = JOptionPane.showInputDialog("Por favor ingrese la empresa empleadora: ");
            int numeroCuentaNomina = Integer.parseInt(JOptionPane.showInputDialog("Por el numero de cuenta de nomina: "));
            CuentaNomina cuentaNomina = new CuentaNomina(nombreTitular, cedula, direccion, depositoInicial, empresaEmpleadora, numeroCuentaNomina);

            salir = false;

            while (!salir) {
                String[] opciones2 = {"Ver cuenta", "Retirar saldo", "Depositar saldo", "Salir"};
                int seleccion2 = JOptionPane.showOptionDialog(null, "Seleccione qué acción desea realizar con su cuenta bancaria:", "Menú de acciones en cuenta bancaria", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones2, opciones2[0]);
                
                switch (seleccion2) {
                case 0:
                JOptionPane.showMessageDialog(null, cuentaNomina.obtenerInformacion());
                break;

                case 1:
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el saldo a retirar: "));
                    cuentaNomina.retirar(retiro);
                    String mensajeEnviado = "Monto retirado: " + "\n" + retiro;
                    JOptionPane.showMessageDialog(null, mensajeEnviado, "Transacción exitosa", JOptionPane.INFORMATION_MESSAGE);
                break;

                case 2:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el saldo a depositar: "));
                    cuentaNomina.depositar(deposito);
                    mensajeEnviado = "Monto depositado: " + "\n" + deposito;
                    JOptionPane.showMessageDialog(null, mensajeEnviado, "Transacción exitosa", JOptionPane.INFORMATION_MESSAGE);
                break;

                default:
                salir = true;
                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                break;
        
                }
            }



            break;



        }



    }


}
