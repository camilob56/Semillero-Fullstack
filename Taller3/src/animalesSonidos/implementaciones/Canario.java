package animalesSonidos.implementaciones;

import animalesSonidos.contratos.Aereo;

public class Canario extends Animal implements Aereo{

    public Canario(String nombre, String raza){
        super(nombre, raza);
    }

    @Override
    public void caminar(){
        System.out.println("Puedo caminar");
    }

    @Override
    public String hacerSonido() {
        return "Los canarios pueden cantar: Trino melodioso del canario.";
    }
    

    @Override
    public void volar() {
        System.out.println("Puedo volar");
    }
}
