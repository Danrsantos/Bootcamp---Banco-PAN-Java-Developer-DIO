/*
    Dadas as seguintes informações sobre meus livros favoritos e seus autores,
    crie um dicionário e ordene este dicionário:
    exibindo (Nome Autor - Nome Livro);
    Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
    Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
    Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("--\t Ordem aleatória \t--");
        Map<String, Livro>meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro(" Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("");

        System.out.println("--\t Ordem Inserção \t--");
        Map<String, Livro>meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro(" Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("");

        System.out.println("--\t Ordem alfabética autores \t--");
        Map<String, Livro>meusLivros2 = new TreeMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro(" Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("");

        System.out.println("--\t Ordem alfabética nomes dos livros \t--");
        Set<Map.Entry<String, Livro>> meusLivrosOrdemALfabetica = new TreeSet<>(new ComparatorNomeLivro());
        meusLivrosOrdemALfabetica.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro1 : meusLivrosOrdemALfabetica){
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());
        }
        System.out.println("");

    }
}