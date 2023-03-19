public class Quadrilatero {
    public static void areaQuadrilatero(double lado){

        System.out.println("Área do quadrado: " + (lado * lado));
    }
    public static void areaQuadrilatero(double lado1, double lado2){
        System.out.println("Área do retângulo: " + (lado1 * lado2));
    }
    public static void areaQuadrilatero(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio: " + ((baseMenor + baseMaior)*altura) / 2);
    }
    public static void areaQuadrilatero(float diagonal1, float diagonal2){
        System.out.println("Área do losango: " + ((diagonal1 * diagonal2) / 2));
    }
}
