public class Main {
    public static void main(String[] args) {
        Carro car = new Carro();

        car.setCor("Preto");
        car.setModelo("Fusca");
        car.setCapacidadeTanque(60);

        System.out.println(car.getCor());
        System.out.println(car.getModelo());
        System.out.println(car.getCapacidadeTanque());
        System.out.println(car.toatalValorTanque(6.50));

        Carro car2 = new Carro("Azul", "Kombi", 70);
        System.out.println(car2.getCor());
        System.out.println(car2.getModelo());
        System.out.println(car2.getCapacidadeTanque());
        System.out.println(car2.toatalValorTanque(6.50));
    }
}
