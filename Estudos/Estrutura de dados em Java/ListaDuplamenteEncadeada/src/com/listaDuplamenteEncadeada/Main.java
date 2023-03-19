package com.listaDuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaDuplamenteEncadeada.add("C1");
        minhaListaDuplamenteEncadeada.add("C2");
        minhaListaDuplamenteEncadeada.add("C3");
        minhaListaDuplamenteEncadeada.add("C4");
        minhaListaDuplamenteEncadeada.add("C5");
        minhaListaDuplamenteEncadeada.add("C6");
        minhaListaDuplamenteEncadeada.add("C7");

        System.out.println(minhaListaDuplamenteEncadeada);

        minhaListaDuplamenteEncadeada.remove(3);
        System.out.println(minhaListaDuplamenteEncadeada);

        minhaListaDuplamenteEncadeada.add(3,"teste");
        System.out.println(minhaListaDuplamenteEncadeada);

        System.out.println(minhaListaDuplamenteEncadeada.get(5));
    }
}
