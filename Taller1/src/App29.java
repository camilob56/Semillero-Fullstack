import java.util.Arrays;

public class App29 {
    public static void main(String[] args){
        // 29.
        int [] numeros = {23,142,286,4,5,6};
        int mayor = numeros[0];

        for(int numero: numeros){
            if(numero > mayor){
                mayor = numero;
            }
        }
        System.out.println("Numeros: " + Arrays.toString(numeros));
        System.out.println("El numero mayor es: " + mayor);
    }
}
