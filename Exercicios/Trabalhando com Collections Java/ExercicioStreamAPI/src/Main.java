import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");
        System.out.println("Imprima todos os elementos dessa lista de Strings: ");
        numerosAleatorios.stream().forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros e coloque desntro de um Set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");
        List<Integer> numerosAleatorios1 = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numerosAleatorios1);

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
        numerosAleatorios.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");
        numerosAleatorios1.removeIf(Integer -> Integer % 2 != 0);
        System.out.println(numerosAleatorios1);
        
    }
}