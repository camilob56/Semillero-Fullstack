package animalesSonidos.implementaciones;

import animalesSonidos.contratos.Aereo;

public class Loro extends Animal implements Aereo{

    public Loro(String nombre, String raza){
        super(nombre, raza);
    }

    @Override
    public void caminar(){
        System.out.println("Puedo caminar");
    }

    @Override
    public String hacerSonido() {
        return "Los loros pueden imitar: ¡Hola, soy un loro que habla!";
    }

    @Override
    public void volar() {
        System.out.println("Puedo volar");
    }
}
