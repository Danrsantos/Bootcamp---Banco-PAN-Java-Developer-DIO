public class Calculadora {
    public static void  soma(double valor1, double valor2){
        double resultado = valor1 + valor2;
        System.out.println("O resultado da soma de " + valor1 + " + " + valor2 + " = " + resultado);
    }
    public static void  subtracao(double valor1, double valor2){
        double resultado = valor1 - valor2;
        System.out.println("O resultado da subtração de " + valor1 + " - " + valor2 + " = " + resultado);
    }
    public static void  multiplicacao(double valor1, double valor2){
        double resultado = valor1 * valor2;
        System.out.println("O resultado da multiplicação de " + valor1 + " X " + valor2 + " = " + resultado);
    }
    public static void  divisao(double valor1, double valor2){
        double resultado = valor1 / valor2;
        System.out.println("O resultado da divisão de " + valor1 + " / " + valor2 + " = " + resultado);
    }
}
