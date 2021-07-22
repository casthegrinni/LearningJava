import org.w3c.dom.ls.LSOutput;

public class ProcessosETestes {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(
                1997,
                "Honda",
                "XLR8"
        );

        Carro carro = new Carro(
                1998,
                "Honda",
                "xlr8",
                4
        );

        Moto moto = new Moto(
                2020,
                "Honda",
                "CB 250 Twister",
                0
        );

        Caminhao caminhao = new Caminhao(
                2019,
                "Scania",
                "r450",
                14
        );

        System.out.println(carro);
        System.out.println(moto);
        System.out.println(caminhao);
    }
}
