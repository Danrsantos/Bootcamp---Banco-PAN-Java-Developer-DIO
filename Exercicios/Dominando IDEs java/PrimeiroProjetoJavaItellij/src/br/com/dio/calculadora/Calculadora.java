package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = soma(a, b);
        int subtrair = subtracao(a, b);
        int multiplicar = multiplicacao(a, b);
        double dividir = divisao(a, b);

        System.out.println("Soma: " + somar);
        System.out.println("Subtração: " + subtrair);
        System.out.println("Multiplicação: " + multiplicar);
        System.out.println("Divisão: " + dividir);
    }
    public static int soma(int a, int b){
        return a + b;
    }   public static int subtracao(int a, int b){
        return a - b;
    }   public static int multiplicacao(int a, int b){
        return a * b;
    }   public static double divisao(int a, int b){
        return a / b;
    }
}
