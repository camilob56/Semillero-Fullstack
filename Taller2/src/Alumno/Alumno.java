package Alumno;

import java.util.Arrays;

public class Alumno {

    private String nombre;
    private int edad;
    private double[] calificaciones;

    // Constructor principal
    public Alumno() {
        nombre = "";
        edad = 0;
        calificaciones = new double[0];
    }


    public void agregarAlumno(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void asignaCalificaciones(double[] calificaciones){
        this.calificaciones = calificaciones;
    }

    public String sacarPromedio(){
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        double promedio = suma/calificaciones.length;
        String promedioF = String.format("%.1f", promedio);
        return "El promedio del alumno " + nombre + " es: " + promedioF;
    }

    
    public String informacionAlumno(){
        return "El nombre del alumno es: " + nombre + " Edad: " + edad + " Calificaciones: " + Arrays.toString(calificaciones) + "\n" + sacarPromedio() + "\n";
    }
    


}
