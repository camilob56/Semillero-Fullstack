package animalesSonidos.implementaciones;

public class Gato extends Animal{

    public Gato(String nombre, String raza){
        super(nombre, raza);
    }

    @Override
    public void caminar(){
        System.out.println("Puedo caminar");
    }

    @Override
    public String hacerSonido() {
        return "Los gatos pueden maullar: ¡Miau miau!";
    }
}
