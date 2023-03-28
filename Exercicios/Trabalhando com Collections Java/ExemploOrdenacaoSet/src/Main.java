/*
    Dadas as seguintes informações sobre minhas séries favoritas,
    crie um conjunto e ordene este conjunto exibindo:
    (nome - genero - tempo de episódio);
    Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
    Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
    Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("--\t Ordem aleatótia \t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comédia", 25));
        }};
//        System.out.println(minhasSeries);
        for (Serie serie : minhasSeries){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println("");

        System.out.println("--\t Ordem inserção \t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comédia", 25));
        }};
        for (Serie serie : minhasSeries1){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println("");

        System.out.println("--\t Ordem natural (TempoEpisodio) \t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);
        for (Serie serie : minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println("");

        System.out.println("--\t Ordem nome/Gênero/TempoEpisodio \t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println("");

    }
}