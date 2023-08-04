import java.util.Arrays;

public class App28 {
    public static void main(String[] args){
        // 28. 
        int [] numeros = {23,12,2,4,5,6};
        int suma = 0;
        for(int numero: numeros){
            suma += numero;
        }
        System.out.println("Numeros: " + Arrays.toString(numeros));
        System.out.println("La suma de los numeros es: " + suma);

    }
}
