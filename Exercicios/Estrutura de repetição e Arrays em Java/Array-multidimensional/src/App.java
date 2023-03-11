import java.util.Random;

/*
 * Gere e imprima uma matriz 4x4 com valores aleatorios entre 0-9.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz[linha][coluna] = random.nextInt(10);
            }
        }

        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println(" ");
            
        }
    }
}
