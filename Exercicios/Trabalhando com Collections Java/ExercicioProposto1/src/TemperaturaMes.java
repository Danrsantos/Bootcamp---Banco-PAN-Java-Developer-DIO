import java.util.ArrayList;
import java.util.List;

public class TemperaturaMes{
    private String mes;
    private Integer temperatura;


    public TemperaturaMes(String mes, Integer temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", temperatura='" + temperatura + '\'' +
                '}';
    }
}
