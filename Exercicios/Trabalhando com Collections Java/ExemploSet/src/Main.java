/*
    Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
    - Crie um conjunto e adicione as notas;
    - Exiba a posição da nota 5.0;
    - Adicione na lista a nota 8.0 na posição 4;
    - Substitua a nota 5.0 pela nota 6.0;
    - Confira se a nota 5.0 está no conjunto;
    - Exiba a terceira nota adicionada;
    - Exiba a menor nota;
    - Exiba a maior nota;
    - Exiba a soma das notas;
    - Exbiba a media das notas;
    - Remova a nota 0;
    - Remova a nota na posição 0;
    - Remova as notas menores que 7 e exiba a lista;
    - Exiba todas as notas na ordem em foram informados;
    - Exiba todas as notas em ordem crescente;
    - Apague todo o conjunto;
    - Confira se o conjunto está vazio;
    - Confira se o conjunto 2 está vazio;
    - Confira se o conjunto 3 está vazio;

 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Formas de se iniciar um set:

        Set notas = new HashSet(); //antes do java 5
        HashSet<Double> notas = new HashSet<>();
        Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
        Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
        */

//        Crie um conjunto e adicione as notas
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);
        System.out.println("");

//        Exiba a posição da nota 5.0;
        // Os itens criados pelo metodo HashSet são odenados na lista de forma aleatoria sesndo assim o set não possui o metodo indexOf

//        Adicione na lista a nota 8.0 na posição 4;
        // Não é possivel trabalhar com posição dentro deu um set

//        Substitua a nota 5.0 pela nota 6.0;
        //Nao é possivel inserir itens em um set já criado

//        Confira se a nota 5.0 está no conjunto
        System.out.println("A nota 5 está no conjunto: " + notas.contains(5d));

//        Exiba a terceira nota adicionada
        // como os valores não possuem indice isso não é possivel

//        Exiba a menor nota
        System.out.println("Menor nota: " + Collections.min(notas));
        System.out.println("");

//        Exiba a maior nota
        System.out.println("Maior nota: " + Collections.max(notas));

//        Exiba a soma das notas
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma das notas: " + soma);
        System.out.println("");

//        Exbiba a media das notas
        System.out.println("Média das notas: " + soma/ notas.size());
        System.out.println("");

//        Remova a nota 0
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("");

//        Remova a nota na posição 0
        // Como já foi dito o metodo set não possi index

//        Remova as notas menores que 7 e exiba a lista
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);
        System.out.println("");

//        Exiba todas as notas na ordem em foram informados
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

//        Exiba todas as notas em ordem crescente
        Set<Double> notas3  = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println("");

//        Apague todo o conjunto
        notas.clear();
        System.out.println(notas);
        System.out.println("");

//        Confira se o conjunto está vazio
        System.out.println("Notas está vazio? " + notas.isEmpty());
        System.out.println("");

//        Confira se o conjunto 2 está vazio
        System.out.println("Notas2 está vazio? " + notas2.isEmpty());
        System.out.println("");

        //        Confira se o conjunto 3 está vazio
        System.out.println("Notas3 está vazio? " + notas3.isEmpty());
        System.out.println("");
    }

}