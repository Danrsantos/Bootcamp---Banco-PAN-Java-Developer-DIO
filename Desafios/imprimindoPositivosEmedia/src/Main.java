import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 6 numeros: ");
        int cont = 0;
        double media = 0;
        double x;

//        TODO: Implemente as condições adequadas para obter a quantidade
//        de valores positivos e a média dos valores positivos:
        for (int i = 0; i < 6; i++) {
            x = leitor.nextDouble();
            if (x > 0) {
                cont++;
                media += x;
            }

        }

        media = media / cont;

        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}