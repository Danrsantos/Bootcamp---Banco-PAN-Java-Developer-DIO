import java.util.Scanner;

import javax.swing.plaf.TextUI;

/*
 * Faça um programa que peça N números inteiros, calcule e mostre a quantidade de numeros 
 * pares e a quantidade de números impares.
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int quantidadeNumeros = 0;
        int count = 0;
        int numero = 0;
        int numerosPares = 0;
        int numerosImpares = 0;

        System.out.println("Quantos numeros deseja verificar? ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if ((numero%2) == 0){
                numerosPares++;
            } else{
                numerosImpares++;
            } 

            count++;
            System.out.println(count + " de " + quantidadeNumeros);
        } while(count < quantidadeNumeros);

        System.out.println("Quantidade de numeros pares: " + numerosPares);
        System.out.println("Quantidade de numeros impares: " + numerosImpares);
    }
}
