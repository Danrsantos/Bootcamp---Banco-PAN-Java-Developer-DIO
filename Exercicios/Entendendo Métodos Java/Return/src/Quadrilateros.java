public class Quadrilateros {
    public static double areaQuadrilatero(double lado) {

        return (lado * lado);
    }

    public static double areaQuadrilatero(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double areaQuadrilatero(double baseMaior, double baseMenor, double altura) {
        return (((baseMenor + baseMaior) * altura) / 2);
    }

    public static float areaQuadrilatero(float diagonal1, float diagonal2) {
        return ((diagonal1 * diagonal2) / 2);
    }
}
