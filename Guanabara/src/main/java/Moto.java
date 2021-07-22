public class Moto extends Veiculo{
    private int kmRodado;

    @Override
    public String toString() {
        return "Moto{" +
                "anoFabricacao='" + getAnoFabricacao() + '\'' +
                "marca='" + getMarca() + '\'' +
                "modelo='" + getModelo() + '\'' +
                "kmRodado='" + kmRodado + '\'' +
                '}';
    }

    // "Create constructor machine"
    public Moto(
            int anoFabricacao,
            String marca,
            String modelo,
            int kmRodado) {

        super(
                anoFabricacao,
                marca,
                modelo);

        this.kmRodado = kmRodado;
    }
}
