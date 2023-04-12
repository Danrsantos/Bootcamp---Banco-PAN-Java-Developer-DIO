package com.gof;

/**
 * Singleton "apressado"
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstanci() {
        return instancia;
    }
}
