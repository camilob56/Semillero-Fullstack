package animalesSonidos.implementaciones;

import animalesSonidos.contratos.Terrestre;

public class Animal implements Terrestre{
    private String nombre;
    private String raza;

    public Animal(String nombre, String raza){
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void caminar() {
        System.out.println("Soy un animal caminando");
    }

    public String hacerSonido() {
        return "Soy animal y hago sonidos";
    }
    

}
