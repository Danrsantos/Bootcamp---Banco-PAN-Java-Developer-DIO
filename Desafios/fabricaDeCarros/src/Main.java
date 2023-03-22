import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Custo de fabrica: ");
        int custoFabrica = scan.nextInt();
        System.out.println("Porcentagem do distribuidor");
        int porcentagemDistribuidor = scan.nextInt();
        System.out.println("Percentual de impostos");
        int PercentualImpostos = scan.nextInt();

        int custoConsumidor;

        int Distribuidor;
        int ValorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
        custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;


        System.out.println(custoConsumidor);
    }
}