/*
    Dadas as seguintes informações sobre meus gatos, crie uma lista e ordene esta lista exibindo: (nome - idade - cor)

    Gato 1 = nome: Jon, Idade: 18, cor: preto
    Gato 2 = nome: Simba, Idade: 6, cor: tigrado
    Gato 1 = nome: Jon, Idade: 12, cor: amarelo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};


        System.out.println("--\t Ordem de Inserção \t---");
        System.out.println(meusGatos);
        System.out.println("");

        System.out.println("--\t Ordem aleatória \t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println("");

        System.out.println("--\t Ordem Natural (Nome) \t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("");

        System.out.println("--\t Ordem Idade \t---");
        Collections.sort(meusGatos,new ComparatorIdade());
        //meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println("");

        System.out.println("--\t Ordem Cor \t---");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);
        System.out.println("");

        System.out.println("--\t Ordem Nome/Cor/Idade \t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
        System.out.println("");

    }
}