import java.util.Comparator;

public class ComparatorAnoNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita linguagemFavorita1, LinguagemFavorita linguagemFavorita2) {
        int ano = linguagemFavorita1.getAnoDeCriacao().compareTo(linguagemFavorita2.getAnoDeCriacao());
        if (ano != 0) return ano;
        return linguagemFavorita1.getNome().compareTo(linguagemFavorita1.getNome());
    }
}
