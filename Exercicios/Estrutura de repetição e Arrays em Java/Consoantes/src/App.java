import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] arrayLetras = new String[6];
        String[] arrayVogais = {"A", "E", "I", "O", "U"};
        String[] arrayConsoantes = new String[6];
        int numeroDeVogais = 0;
        int numeroDeConsoantes = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite uma letra: ");
            arrayLetras[i] = scan.next();
            String letra = arrayLetras[i];
            for (String vogais : arrayVogais) {
                if(letra.equalsIgnoreCase(vogais)){
                    numeroDeVogais++;
                    break;
                } else {
                    arrayConsoantes[numeroDeConsoantes] = letra;
                    numeroDeConsoantes++;
                    break;
                }
            }
        }

        System.out.println("Número de Vogais: " + numeroDeVogais);
        System.out.println("Número de Consoantes: " + numeroDeConsoantes);

        System.out.println("Consoantes encontradas: ");

        for (String consoante : arrayConsoantes) {
            if (consoante != null){
                System.out.print(consoante + " ");
            }
        }
        

    }
}
