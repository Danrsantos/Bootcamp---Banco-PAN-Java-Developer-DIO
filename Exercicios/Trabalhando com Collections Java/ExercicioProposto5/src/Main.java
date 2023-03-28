/*
    Dada a população estimada de alguns estados do nordeste brasileiro, faça:
     Estado = PE - população = 9.616.621
     Estado = AL - população = 3.351.543
     Estado = CE - população  = 9.187.103
     Estado = RN - população = 3.534.265
 */

import java.util.*;

public class Main {
    public static <iterator> void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");

        Map<String, Integer> populacaoPorEstadoNE = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(populacaoPorEstadoNE);

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populacaoPorEstadoNE.put("RN", 3534165);
        System.out.println(populacaoPorEstadoNE);

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione --> " + populacaoPorEstadoNE.containsKey("PB"));
        if (!populacaoPorEstadoNE.containsKey("PB"))  populacaoPorEstadoNE.put("PB", 6273846);
        System.out.println(populacaoPorEstadoNE);

        System.out.println("Exiba a população do estado PE: " + populacaoPorEstadoNE.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados:");
        for (String estado : populacaoPorEstadoNE.keySet()){
            System.out.println(estado + " - " + populacaoPorEstadoNE.get(estado));
        }

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String , Integer> ordemAlfabetica = new TreeMap<>(populacaoPorEstadoNE);
        System.out.println(ordemAlfabetica);

        System.out.println("Exiba o estado com o menor população e seu respectivo valor: ");
        int menorPopulacao = Collections.min(populacaoPorEstadoNE.values());
        Set<Map.Entry<String, Integer>> entries = populacaoPorEstadoNE.entrySet();
        for (Map.Entry<String, Integer> entry : entries){
            if (entry.getValue().equals(menorPopulacao)){
                System.out.println(entry.getKey() + " - " + menorPopulacao);
            }
        }

        System.out.println("Exiba a soma da população desses estados: ");
        Iterator<Integer> iterator = populacaoPorEstadoNE.values().iterator();
        int soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média da população deste dicionário de estados: " + soma / populacaoPorEstadoNE.size());

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterador1 = populacaoPorEstadoNE.values().iterator();
        while (iterador1.hasNext()){
            if(iterador1.next() < (4000000)) iterador1.remove();
        }
        System.out.println(populacaoPorEstadoNE);

        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoPorEstadoNE.clear();

        System.out.println("Confira se a lista está vazia: " + populacaoPorEstadoNE.isEmpty());


    }
}