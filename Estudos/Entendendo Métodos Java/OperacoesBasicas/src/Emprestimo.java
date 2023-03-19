public class Emprestimo {
    public static void Emprestimo(double valorEmprestimo, int numeroDeParcelas){
        // Parcela em ate 12x e apartir de 3 vezes acrecenta juros de 2% a cada parcela
        double valorParcela;
        double valorTotalEmprestimo = 0;

        switch (numeroDeParcelas){
            case 1:
                System.out.println("Valor a vista: "+ valorEmprestimo);
                break;
            case 2:
            case 3:
                valorParcela = valorEmprestimo / numeroDeParcelas;
                System.out.println("emprestimo de R$" + valorEmprestimo + " Parcelado em " + numeroDeParcelas + "X de: " +valorParcela);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                valorParcela = (valorEmprestimo / numeroDeParcelas) * 1.02;
                valorTotalEmprestimo = valorParcela * numeroDeParcelas;
                System.out.println("emprestimo de R$" + valorEmprestimo + " Parcelado em " + numeroDeParcelas + "X de: " +valorParcela);
                System.out.println("valor total a pagar: " + valorTotalEmprestimo);
                break;
            default:
                System.out.println("O valor de parcelas sugerido não atende os requesitos (1 - 12x)");
        }
    }
}
