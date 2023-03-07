import java.util.Scanner;

public class App {
    /*Com if, exiba o nome do mës do ano de acordo com o seu numero. Evite o efeito "flecha". Faça também outro if que verifique se o mês é julho, dezembro ou janeiro, para assim
    exibir o texto "ferias".
    Com switch use String para a partir do dia da semana, exibir seu número. ainda no switch, faça outro exemplo onde, se uma variavel inteira dor entre 1 e 3 exibir 
    o texto "Certo", se for 4 exibir "Errado", se for 5 "Talvez". Pra demais valores exibir "Valor indefinido".

    */

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 12 para saber o mês correspondente: ");
        int mesEntrada = scanner.nextInt();
        String mesSaida = "";

        if (mesEntrada == 1){
            mesSaida = "Janeiro";
            System.out.println(mesSaida);
        }
        else if (mesEntrada == 2){
            mesSaida = "Fevereiro";
            System.out.println(mesSaida);
        }
        else if (mesEntrada == 3){
            mesSaida = "Março";
            System.out.println(mesSaida);
        }
        else if (mesEntrada == 4){
            mesSaida = "Abril";
            System.out.println(mesSaida);
        }
        else if (mesEntrada == 5){
            mesSaida = "Maio";
            System.out.println(mesSaida);
        }
        else if (mesEntrada == 6){
            mesSaida = "Junho";
            System.out.println(mesSaida);
        }
        else if (mesEntrada == 7){
            mesSaida = "Julho";
            System.out.println(mesSaida);
        }
        else if (mesEntrada == 8){
            mesSaida = "Agosto";
            System.out.println(mesSaida);
        }
        else if (mesEntrada == 9){
            mesSaida = "Setembro";
            System.out.println(mesSaida);
        }
        else if (mesEntrada == 10){
            mesSaida = "Outubro";
            System.out.println(mesSaida);
        }
        else if (mesEntrada == 11){
            mesSaida = "Novembro";
            System.out.println(mesSaida);
        }
        else if (mesEntrada == 12){
            mesSaida = "Dezembro";
            System.out.println(mesSaida);
        }
        else {
            System.out.println("O numero informado não corresponde a um mês valido!");
        }

        // // verificando se o mês é julho, dezembro ou janeiro, para assim exibir o texto "ferias".

        if (mesSaida == "Julho" || mesSaida == "Janeiro" || mesSaida == "Dezembro"){
            System.out.println("Férias");
        }

            System.out.println("Digite um dia da semana (segunda, terça....): "); 
            String diaSemanaEntrada = scanner.next();
            int diaSemanaSaida = 0;

            switch (diaSemanaEntrada.toUpperCase()){
                case "DOMINGO":
                    diaSemanaSaida = 1;
                    System.out.println(diaSemanaSaida);
                    break;
                case "SEGUNDA":
                    diaSemanaSaida = 2;
                    System.out.println(diaSemanaSaida);
                    break;
                case "TERÇA":
                    diaSemanaSaida = 3;
                    System.out.println(diaSemanaSaida);
                    break;
                case "QUARTA":
                    diaSemanaSaida = 4;
                    System.out.println(diaSemanaSaida);
                // break;
                case "QUINTA":
                    diaSemanaSaida = 5;
                    System.out.println(diaSemanaSaida);
                    break;
                case "SEXTA":
                    diaSemanaSaida = 6;
                    System.out.println(diaSemanaSaida);
                    break;
                case "SABADO":
                    diaSemanaSaida = 7;
                    System.out.println(diaSemanaSaida);
                    break;
                default:
                    System.out.println("O numero fornecido não corresponde a nenhum dia da samana");
            }


            switch (diaSemanaSaida){
                case 1:
                    System.out.println("Certo");
                    break;
                case 2:
                    System.out.println("Certo");
                    break;
                case 3:
                    System.out.println("Certo");
                    break;
                case 4:
                    System.out.println("Errado");
                    break;
                case 5:
                    System.out.println("Talvez");
                    break;
                default:
                    System.out.println("Valor indefinido");

            }
                
        
    }
}
