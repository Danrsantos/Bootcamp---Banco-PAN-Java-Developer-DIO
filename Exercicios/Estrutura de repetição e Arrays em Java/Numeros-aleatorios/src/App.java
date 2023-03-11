import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros aleatorios (entre 0 e 100) armazene-os em um vetor.
 * Ao final mostre os numeros e seus sucessores.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];
        int[] sucessores = new int[20];

        for(int i = 0; i < 20; i++){
            numerosAleatorios[i] = random.nextInt(101);
            sucessores[i] = numerosAleatorios[i] + 1;
        }

        for (int numeros : numerosAleatorios) {
            System.out.println("Números aleatorios: " + numeros);
        }

        for (int sucessor : sucessores) {
            System.out.println("Sucessores: " + sucessor);
        }
    }
}
