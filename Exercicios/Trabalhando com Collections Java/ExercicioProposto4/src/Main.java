import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
    Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
    Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
    a) Ordem de inserção;
    b) Ordem natural(nome);
    c) IDE;
    d) Ano de criação e nome;
    e) Nome, ano de criação e IDE;
    Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class Main {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLInguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1991, "Intellij"));
            add(new LinguagemFavorita("C#", 2000, "Visual Studio"));
            add(new LinguagemFavorita("Python", 1991, "IDLE"));
        }};

        System.out.println("Ordem de inserção");
        for (LinguagemFavorita linguagem : minhasLInguagens){
            System.out.println(linguagem);
        }
        System.out.println("");

        System.out.println("Ordem natural(nome)");
        Set<LinguagemFavorita> linguagensPorNome = new TreeSet<>(new ComparatorNome());
        linguagensPorNome.addAll(minhasLInguagens);
        for (LinguagemFavorita linguagem : linguagensPorNome){
            System.out.println(linguagem);
        }
        System.out.println("");

        System.out.println("Ordem por IDE");
        Set<LinguagemFavorita> linguagensPorIDE = new TreeSet<>(new ComparatorIDE());
        linguagensPorIDE.addAll(minhasLInguagens);
        for (LinguagemFavorita linguagem : linguagensPorIDE){
            System.out.println(linguagem);
        }
        System.out.println("");

        System.out.println("Ordem Ano de criação e nome");
        Set<LinguagemFavorita> linguagensPorAnoeNome = new TreeSet<>(new ComparatorAnoNome());
        linguagensPorAnoeNome.addAll(minhasLInguagens);
        for (LinguagemFavorita linguagem : linguagensPorAnoeNome){
            System.out.println(linguagem);
        }
        System.out.println("");
        
    }
}