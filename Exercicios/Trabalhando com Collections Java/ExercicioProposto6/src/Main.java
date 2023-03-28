import java.util.*;

/*
    Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
    Depois, mostre quantas vezes cada valor foi conseguido.
 */
public class Main {
    public static void main(String[] args) {
        int valor = 0;
        List<Integer> dados = new ArrayList<>();
        for (int i = 0 ; i <= 100; i++){
            Random random = new Random();
            valor = random.nextInt(101);
            dados.add(valor);
        }

        System.out.println(dados);

        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer count : dados){
            if (lancamentos.containsKey(count)){
                lancamentos.put(count,(lancamentos.get(count)+1));
            } else {
                lancamentos.put(count, 1);
            }
        }

        System.out.println(lancamentos);


    }
}