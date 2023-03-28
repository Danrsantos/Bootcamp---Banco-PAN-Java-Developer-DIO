/*
    Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
    Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
    e em que mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro, etec....)
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<TemperaturaMes> temperaturaMes = new ArrayList<>() {{
            add(new TemperaturaMes("Janeiro", 23));
            add(new TemperaturaMes("Fevereiro", 24));
            add(new TemperaturaMes("Março", 23));
            add(new TemperaturaMes("Abril", 21));
            add(new TemperaturaMes("Maio", 19));
            add(new TemperaturaMes("Junho", 17));
        }};

        int mediaSemestral = 0;
        for (TemperaturaMes temperatura : temperaturaMes) {
            mediaSemestral += temperatura.getTemperatura();
        }
        mediaSemestral = mediaSemestral / temperaturaMes.size();

        int finalMediaSemestral = mediaSemestral;
        List<TemperaturaMes> temperaturasAcimaDaMedia = new ArrayList<>(){{
            for (TemperaturaMes temperatura : temperaturaMes) {
                if(temperatura.getTemperatura() > finalMediaSemestral){
                    add(new TemperaturaMes(temperatura.getMes(), temperatura.getTemperatura()));
                }
            }
        }};
        System.out.println("Média semestral: " + finalMediaSemestral);
        temperaturasAcimaDaMedia.sort(new ComparatorTemperatura());

        System.out.println(temperaturasAcimaDaMedia);

    }
}