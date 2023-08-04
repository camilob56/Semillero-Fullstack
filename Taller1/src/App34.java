import java.util.Arrays;

public class App34 {
    public static void main(String[] args) {
        // 34.
        int[] numeros = {2, 43, 286, 4, 12, 6, 11, 23, 43, 2, 43, 6, 11, 6};
        int posiciones = 5; 
        int[] izquierda = rotarI(numeros, posiciones);
        int[] derecha = rotarD(numeros, posiciones);
        
        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        System.out.println("Arreglo rotado hacia la izquierda " + posiciones + " posiciones: " + Arrays.toString(izquierda));
        System.out.println("Arreglo rotado hacia la derecha " + posiciones + " posiciones: " + Arrays.toString(derecha));
    }

    public static int[] rotarI(int[] arreglo, int n) {
        int[] resultado = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            int newIndex = (i - n + arreglo.length) % arreglo.length;
            resultado[newIndex] = arreglo[i];
        }
        return resultado;
    }

    public static int[] rotarD(int[] arreglo, int n) {
        int[] resultado = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            int newIndex = (i + n) % arreglo.length;
            resultado[newIndex] = arreglo[i];
        }
        return resultado;
    }
}
