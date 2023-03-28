import java.util.ArrayList;
import java.util.List;

public class Interrogatorio {

    public String pergunta;
    public String resposta;

    public Interrogatorio(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return "Interrogatorio{" +
                "pergunta='" + pergunta + '\'' +
                ", resposta=" + resposta +
                '}';
    }
}
