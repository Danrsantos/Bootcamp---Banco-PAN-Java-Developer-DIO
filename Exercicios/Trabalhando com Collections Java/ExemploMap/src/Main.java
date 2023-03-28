/*
     Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
     modelo = gol - consumo = 14,4km/l
     modelo = uno - consumo = 15,6 km/l
     modelo = mobi - consumo = 16,1 km/l
     modelo = hb20 - consumo = 14,5 km/l
     modelo = kwid - consumo = 15,6 km/l
 */


import java.util.*;

public class Main {
    public static void main(String[] args) {
//        formas de se iniciar um Map:

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("Uno"));

        System.out.println("Exiba o terceiro modelo adicionado: Assim como no set os itens são adcionados de forma eleatoria");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double economico = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloEconomico = "";
        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(economico)){
                modeloEconomico = entry.getKey();
                System.out.println("Modelo mais econômico: " + modeloEconomico + " - " + economico);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double menosEconomico = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEconomico = "";
        for (Map.Entry<String, Double> entry1 : entries1) {
            if(entry1.getValue().equals(menosEconomico)){
                modeloMenosEconomico = entry1.getKey();
                System.out.println("Modelo menos econômico: " + modeloMenosEconomico + " - " + menosEconomico);
            }
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + soma / carrosPopulares.size());

        System.out.println("Remova os modelos com consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        carrosPopulares2.putAll(carrosPopulares1);
        System.out.println(carrosPopulares2);

        System.out.println("Apague o dicionários de carros");
        carrosPopulares.clear();

        System.out.println("Confira se a lista está vazia ---> " + carrosPopulares.isEmpty());


    }
}