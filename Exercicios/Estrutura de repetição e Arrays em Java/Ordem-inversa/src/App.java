import java.util.Scanner;

/*
 * Crie um vetor de 6 numeros inteiros e mostre-os na ordem inversa.
 */

public class App {
    public static void main(String[] args) throws Exception {
        int[] arrayNumeros = new int[6];

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 6; i++){
            System.out.println("Digite um numero: ");
            arrayNumeros[arrayNumeros.length - i] = scan.nextInt();
        }

        System.out.println("Array invertido: ");

        for(int valor : arrayNumeros){
            System.out.println(valor);
        }


    }
}
