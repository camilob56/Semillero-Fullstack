import java.util.Arrays;

public class App31 {
    public static void main(String[] args){
        // 31.
        int [] numeros = {2,43,286,4,12,6, 11, 23, 43};
        System.out.println("Numeros: " + Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Numeros en orden ascendente: " + Arrays.toString(numeros));
    }
}
