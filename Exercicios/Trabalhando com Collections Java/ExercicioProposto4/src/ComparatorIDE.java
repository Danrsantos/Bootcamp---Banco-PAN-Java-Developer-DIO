import java.util.Comparator;

public class ComparatorIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita IDE1, LinguagemFavorita IDE2) {
        return IDE1.getIDE().compareTo(IDE2.getIDE());
    }
}
