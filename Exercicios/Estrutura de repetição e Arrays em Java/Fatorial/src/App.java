import java.util.Scanner;

/*
 * Faça um programa que calcula o fatorial de um número inteiro fornecido pelo usuário.
 * Ex: 5! = 120
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero para saber seu fatorial: ");
        int fatorial = scan.nextInt();
        int resultado = 1;

        for(int i = 1; i <= fatorial; i++){
            resultado = resultado * i;
        }
        System.out.println(fatorial + "! = " + resultado);

    }
}
