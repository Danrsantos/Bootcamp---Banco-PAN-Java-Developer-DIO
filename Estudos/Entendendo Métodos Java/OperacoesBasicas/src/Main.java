/*
Criar uma aplicação que resolva as seguintes situações:

- Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
- A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.
- Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam. Defina
arbitrariamente as faixas que influenciam nos valores

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Mensagem.mensagem();

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor1 = scan.nextDouble();
        System.out.println("Digite um valor: ");
        double valor2 =scan.nextDouble();

        Calculadora.soma(valor1, valor2);
        Calculadora.subtracao(valor1, valor2);
        Calculadora.multiplicacao(valor1, valor2);
        Calculadora.divisao(valor1, valor2);

        System.out.println("insira o valor do emprestimo: ");
        double valorEmprestimo = scan.nextDouble();
        System.out.println("O empretimo pode ser parcelado em até 12x, em quantas deseja parcelar? ");
        int numeroParcelas = scan.nextInt();

        Emprestimo.Emprestimo(valorEmprestimo, numeroParcelas);


    }

}