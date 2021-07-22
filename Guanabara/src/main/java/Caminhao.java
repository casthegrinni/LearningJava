public class Caminhao extends Veiculo {
    private int qtdRodas;

    public String toString() {
        return "Caminhao{" +
                "anoFabricacao='" + getAnoFabricacao() + '\'' +
                "marca='" + getMarca() + '\'' +
                "modelo='" + getModelo() + '\'' +
                "qtdRodas='" + qtdRodas + '\'' +
                '}';
    }

    public Caminhao(
            int anoFabricacao,
            String marca,
            String modelo,
            int qtdRodas) {

        super(
                anoFabricacao,
                marca,
                modelo);

    this.qtdRodas = qtdRodas;
    }
}
