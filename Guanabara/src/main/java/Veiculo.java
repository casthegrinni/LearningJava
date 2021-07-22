import java.util.*;

public class Veiculo {
    // Definindo as variáveis dentro da classe
    private int anoFabricacao;
    private String marca;
    private String modelo;

    // Para "exportar" a estrutura da classe
    public Veiculo(int anoFabricacao, String marca, String modelo) {
        this.anoFabricacao = anoFabricacao;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Aqui eu utilizei o toString() para conseguir "exportar" para o Processor já com esse formato
    // (E aparecerem os dados ao invés do endereço da classe)
    @Override
    public String toString() {
        return "Veiculo{" +
                "anoFabricacao=" + anoFabricacao +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    // Consegui resgatar esses abaixo com o Getter and Setter
    // E serviram, no geral, para conseguir usar na herança

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
