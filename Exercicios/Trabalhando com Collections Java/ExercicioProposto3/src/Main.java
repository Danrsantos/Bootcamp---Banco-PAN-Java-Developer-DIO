import java.util.*;

/*
    Crie uma conjunto contendo as cores do arco-íris e:
    a) Exiba todas as cores o arco-íris uma abaixo da outra;
    b) A quantidade de cores que o arco-íris tem;
    c) Exiba as cores em ordem alfabética;
    d) Exiba as cores na ordem inversa da que foi informada;
    e) Exiba todas as cores que começam com a letra ”v”;
    f) Remova todas as cores que não começam com a letra “v”;
    g) Limpe o conjunto;
    h) Confira se o conjunto está vazio;
 */
public class Main {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Violeta");

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cores : coresArcoIris){
            System.out.println(cores);
        }
        System.out.println("");

        System.out.println("A quantidade de cores que o arco-íris tem: " + coresArcoIris.size());
        System.out.println("");

        System.out.println("Exiba as cores em ordem alfabética");
        Set<String> coresArcoIris1 = new TreeSet<>(coresArcoIris);
        for (String cores1 : coresArcoIris1){
            System.out.println(cores1);
        }
        System.out.println("");

        System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
        Set<String> coresArcoIris2 = new LinkedHashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris2);

        Collections.reverse(coresArcoIrisList);
        for (String cores2 : coresArcoIrisList){
            System.out.println(cores2);
        }
        System.out.println("");

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String coresComV : coresArcoIris){
            if (coresComV.startsWith("V")){
                System.out.println(coresComV);
            }
        }
        System.out.println("");

        System.out.println("Limpe o conjunto");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);
        System.out.println("");

        System.out.println("Confira se o conjunto está vazio ---> " + coresArcoIris.isEmpty());

    }

}