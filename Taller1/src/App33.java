import java.util.Arrays;
import java.util.HashMap;

public class App33 {
    public static void main(String[] args) {
        // 33.
        int[] numeros = {2, 43, 286, 4, 12, 6, 11, 23, 43, 2, 43, 6, 11, 6};
        System.out.println("Numeros: " + Arrays.toString(numeros));
        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        for (int numero : numeros) {
            frecuencia.put(numero, frecuencia.getOrDefault(numero, 0) + 1);
        }
        for (int numero : frecuencia.keySet()) {
            int veces = frecuencia.get(numero);
            System.out.println("Número " + numero + " esta " + veces + " veces");
        }
    }
}
