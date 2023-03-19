package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        boolean b2 = true;
        System.out.println("Hello World!! " + (a+b));

        Gato gato = new Gato();

        System.out.println(gato);

        if (!b2){
            System.out.println("foi");
        }else {
            System.out.println("sajhdfasjk");
        }
    }
}
