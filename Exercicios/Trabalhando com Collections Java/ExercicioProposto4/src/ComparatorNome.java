import java.util.Comparator;

public class ComparatorNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        return linguagem1.getNome().compareTo(linguagem2.getNome());
    }
}
