/*
    Crie um aplicação que calcula a área dos 3 quidriláteros notáveis:
    quadrado, retângulo e trapézio
    Use sobrecarga
 */

public class Main {
    public static void main(String[] args) {
        Quadrilatero.areaQuadrilatero(25);
        Quadrilatero.areaQuadrilatero(10d,20d);
        Quadrilatero.areaQuadrilatero(30,15,10);
        Quadrilatero.areaQuadrilatero(45f,30f);
    }
}