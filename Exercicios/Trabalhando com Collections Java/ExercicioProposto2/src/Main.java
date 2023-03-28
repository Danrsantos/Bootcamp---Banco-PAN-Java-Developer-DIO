import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As pergunts são:
    1 - Telefonou para a vítima?
    2 - Esteve no local do crime?
    3 - Mora perto da vítima?
    4 - Devia para a vítima?
    5 - Já trabalhou com a vítima?

    Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
    e 5 como "Assassina". Caso contrário, ela será classificada como "Inocente";

 */
public class Main {
    public static void main(String[] args) {
        List<Interrogatorio> interrogatorio = new ArrayList<>(){{
            add(new Interrogatorio("Telefonou para a vítima? (S/N)", ""));
            add(new Interrogatorio("Esteve no local do crime? (S/N)", ""));
            add(new Interrogatorio("Mora perto da vítima? (S/N)", ""));
            add(new Interrogatorio("Devia para a vítima? (S/N)", ""));
            add(new Interrogatorio("Já trabalhou com a vítima? (S/N)", ""));
        }};

        Scanner scan = new Scanner(System.in);
        int count  = 0;
        for (Interrogatorio pergunta : interrogatorio ) {
            System.out.println(pergunta.getPergunta());
            pergunta.setResposta(scan.nextLine().toUpperCase());
            if (pergunta.getResposta().equals("S")){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Suspeita");
        } else if (count > 2 && count < 5) {
            System.out.println("Cúmplice");
        } else if (count == 5) {
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }
    }
}