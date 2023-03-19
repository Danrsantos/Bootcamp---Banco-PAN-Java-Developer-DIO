import java.util.Scanner;

/*
 * Faça um programa que peça uma  nota, entre zero e dez.
 * mostre uma mensagem caso o valor da nota seja invalido
 * e continue pedindo até que o usuário informe um valor valido
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double nota = 0;
        System.out.println("Digite uma nota de 0 a 10: ");
        nota = scan.nextDouble();

        while ((nota < 0) || (nota > 10)){            
            System.out.println("Valor digitado invalido! ");
            System.out.println("Digite uma nota de 0 a 10: ");
            nota = scan.nextDouble();            
        }
    }
}
