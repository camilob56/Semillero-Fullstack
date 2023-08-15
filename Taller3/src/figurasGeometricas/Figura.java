package figurasGeometricas;

abstract public class Figura {
    private String nombre;

    public Figura(String nombre){
        this.nombre = nombre;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();
    
}
