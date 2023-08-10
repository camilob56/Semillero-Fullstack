package Alumno;

public class SistemaAlumnos {
    public static void main(String[] args) {
        
        
        Alumno alum1 = new Alumno();
        Alumno alum2 = new Alumno();
        Alumno alum3 = new Alumno();

        alum1.agregarAlumno("Camilo", 23);
        alum1.asignaCalificaciones(new double[] {4.3, 3.0, 5.0});
        alum1.sacarPromedio();

        alum2.agregarAlumno("Juan", 22);
        alum2.asignaCalificaciones(new double[] {4.1, 4.0, 3.1});
        alum1.sacarPromedio();

        alum3.agregarAlumno("Pedro", 21);
        alum3.asignaCalificaciones(new double[] {4.2, 3.5, 4.4});
        alum1.sacarPromedio();

        System.out.println(alum1.informacionAlumno());
        System.out.println(alum2.informacionAlumno());
        System.out.println(alum3.informacionAlumno());


    }
}
