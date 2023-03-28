/*
    Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
    - Crie uma lista e adicione as sete notas;
    - Exiba a posição da nota 5.0:;
    - Adicione na lista a nota 8.0 na posição 4;
    - Substitua a nota 5.0 pela nota 6.0;
    - Confira se a nota 5.0 está na lista;
    - Exiba todas as notas na ordem em que foram informadas;
    - Exiba a terceira nota adicionada;
    - Exiba a menor nota;
    - Exiba a maior nota;
    - Exiba a soma dos valores;
    - Exiba a média das notas;
    - Remova a nota 0;
    - Remova a nota na posição 0;
    - Remova as notas menores que 7 e exiba a lista;
    - Apague toda a lista;
    - Confira se a lista está vazia;

 */

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Crie uma lista e adicione as sete notas
        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("");

//        Exiba a posição da nota 5.0:
        System.out.println(notas.indexOf(5d));
        System.out.println("");

//        Adicione na lista a nota 8.0 na posição 4
        notas.add(4, 8d);
        System.out.println(notas);
        System.out.println("");

//        Substitua a nota 5.0 pela nota 6.0
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);
        System.out.println("");

//        Confira se a nota 5.0 está na lista
        System.out.println("Nota 5 está na lista: " + notas.contains(5d));
        System.out.println("");

//        Exiba todas as notas na ordem em que foram informadas
        for (Double nota : notas) {
            System.out.println(notas.indexOf(nota) + " - " + nota);
        }
        System.out.println("");

//        Exiba a terceira nota adicionada
        System.out.println(notas.get(2));
        System.out.println("");

//        Exiba a menor nota
        System.out.println(Collections.min(notas));
        System.out.println("");

//        Exiba a maior nota
        System.out.println(Collections.max(notas));
        System.out.println("");

//        Exiba a soma dos valores
        double sumNotas = 0;
        for (Double nota : notas) {
            sumNotas += nota;
        }
        System.out.println(sumNotas);

//        outra forma de se fazer o item - Exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        sumNotas = 0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            sumNotas += next;
        }
        System.out.println(sumNotas);
        System.out.println("");

//        Exiba a média das notas
        sumNotas = sumNotas / notas.size();
        System.out.println(sumNotas);
        System.out.println("");

//        Remova a nota 0;
        System.out.println(notas);
        notas.remove(notas.indexOf(0d));
        System.out.println(notas);
        System.out.println("");

//        Remova a nota na posição 0
        System.out.println(notas);
        notas.remove(0);
        System.out.println(notas);
        System.out.println("");

//        Remova as notas menores que 7 e exiba a lista
        System.out.println(notas);
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);
        System.out.println("");

//        Apague toda a lista
        notas.clear();
        System.out.println(notas);
        System.out.println("");

//        Confira se alista está vazia
        System.out.println("A lista está vazia? " + notas.isEmpty());
    }
}