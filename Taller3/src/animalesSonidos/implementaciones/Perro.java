package animalesSonidos.implementaciones;

public class Perro  extends Animal{

    public Perro(String nombre, String raza){
        super(nombre, raza);
    }

    @Override
    public void caminar(){
        System.out.println("Puedo caminar");
    }

    @Override
    public String hacerSonido() {
        return "Los perros pueden ladrar: ¡Guau guau!";
    }


}
