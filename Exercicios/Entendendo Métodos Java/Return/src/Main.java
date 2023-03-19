/*
    Recrie a aplicação que calcula a área dos 3 quidriláteros nótaveis. Agora faça os métodos retornarem valores.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Área do quadrado: " + Quadrilateros.areaQuadrilatero(30));
        System.out.println("Área do retângulo: " + Quadrilateros.areaQuadrilatero(30d,20d));
        System.out.println("Área do trapézio: " + Quadrilateros.areaQuadrilatero(50,20,60));
        System.out.println("Área do losango: " + Quadrilateros.areaQuadrilatero(10f,50f));

    }
}