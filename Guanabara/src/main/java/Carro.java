public class Carro extends Veiculo {
    private int qtdPortas;

    @Override
    public String toString() {
        return "Carro{" +
                "anoFabricacao='" + getAnoFabricacao() + '\'' +
                "marca='" + getMarca() + '\'' +
                "modelo='" + getModelo() + '\'' +
                "qtdPortas='" + qtdPortas + '\'' +
                '}';
    }

    public Carro(
            int anoFabricacao,
            String marca,
            String modelo,
            int qtdPortas) {

        super(
                anoFabricacao,
                marca,
                modelo);

        this.qtdPortas = qtdPortas;
    }
}
