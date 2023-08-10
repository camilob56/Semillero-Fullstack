package ReservaHotel;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombreEmpresa;
    private List<String> nombresHuespedes;
    private int cedulaEmpleado;

    public Cliente(String nombreEmpresa, int cedulaEmpleado) {
        this.nombreEmpresa = nombreEmpresa;
        this.nombresHuespedes = new ArrayList<>();
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public void agregarHuesped(String nombre) {
        nombresHuespedes.add(nombre);
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public List<String> getNombresHuespedes() {
        return nombresHuespedes;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

}

