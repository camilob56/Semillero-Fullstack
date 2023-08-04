import java.util.Arrays;

public class App30 {
    public static void main(String[] args){
        // 30.
        int [] numeros = {2,43,286,4,12,6, 11, 23, 43};
        System.out.println("Numeros: " + Arrays.toString(numeros));
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    System.out.println("Elemento duplicado encontrado: " + numeros[i]);
                    break;
                }
            }
        }       
        
    }
}
