import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual numero ele deseja ver a tabuada.
 * A saída de ser conforme o exemplo abaixo:
 * 
 * ex:
 * 
 * Tabuada do 5: 
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 X 10 = 50
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int tabuada = 0;

        System.out.println("Dentre as tabuas do 1 ao 10, informe a que deseja visualizar: ");
        tabuada = scan.nextInt();


        if (tabuada > 0 && tabuada <= 10){
            for(int i = 0; i <= 10 ; i++){
                System.out.println(tabuada + " x " + i + " = " + (i * tabuada));
            }
        } else{
            System.out.println("Valor invalido, favor informar um numero de 1  10");
        }


    }
}
