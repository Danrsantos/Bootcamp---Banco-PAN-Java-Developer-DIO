import java.util.Comparator;

public class ComparatorTemperatura implements Comparator<TemperaturaMes> {
    @Override
    public int compare(TemperaturaMes temperaturaMes1, TemperaturaMes temperaturaMes2) {
        return Integer.compare(temperaturaMes1.getTemperatura(), temperaturaMes2.getTemperatura());
    }

}
