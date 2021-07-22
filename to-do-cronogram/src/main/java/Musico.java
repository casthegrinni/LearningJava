import java.util.Date;

public class Musico extends Pessoa {
    private String instrumento;

    @Override
    public String toString() {
        return "Musico{" +
                "tipoCabelo='" + getTipoCabelo() + '\'' +
                "nome='" + getNome() + '\'' +
                "sobrenome='" + getSobrenome() + '\'' +
                "dataNascimento='" + getDataNascimento() + '\'' +
                "instrumento='" + instrumento + '\'' +
                '}';
    }

    public Musico(String tipoCabelo,
                  String nome,
                  String sobrenome,
                  Date dataNascimento,
                  String instrumento) {
        super(
                tipoCabelo,
                nome,
                sobrenome,
                dataNascimento);

        this.instrumento = instrumento;
    }
}
