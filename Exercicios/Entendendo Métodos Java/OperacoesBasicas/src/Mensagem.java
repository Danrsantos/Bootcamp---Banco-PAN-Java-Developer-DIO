import java.text.SimpleDateFormat;
import java.util.Date;

public class Mensagem {

    public static void mensagem(){

        Date dataHoraAtual = new Date();
        String horaAtual = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH").format(dataHoraAtual);
        int horaCovertida = Integer.parseInt(hora);

        if(horaCovertida < 12){
            System.out.println("Bom dia");
        } else if ((horaCovertida < 12) && (horaCovertida < 18)){
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }

}
