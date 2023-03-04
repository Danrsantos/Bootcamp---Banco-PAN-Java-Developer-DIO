public class MinhaClasse {
    public static void main(String[] args) {
        //System.out.print("Olá");
        String primeiroNome = "Danilo";
        String segundoNome = "Ribeiro";
        int idade = 28;
        double altura = 1.80; 
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }  
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
