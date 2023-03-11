import java.util.Scanner;

/*
 * Faça um programa que leia 5 números e informe o maior número e a média desses numeros
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double numero;
        double maiorNumero = 0;
        double somaNumeros = 0;
        int contador = 0;

       do {
            System.out.println("Digite um número: ");
            numero = scan.nextDouble();

            if(numero > maiorNumero){
                maiorNumero = numero;
            }

            somaNumeros += numero;
            contador ++;
        } while (contador < 5);

        System.out.println("O maior numero informado foi: " + maiorNumero);
        System.out.println("A madia dos números informado é " + (somaNumeros/5));




    }
}
