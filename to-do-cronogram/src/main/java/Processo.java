import java.util.Calendar;
import java.util.Date;

public class Processo {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                "Cacheado",
                "Brunno",
                "Castegrini",
                new Date(2001, Calendar.MARCH,19)
        );
        Musico musico = new Musico(
                "cacheado",
                "Brunno",
                "Castigrini",
                new Date(2001, Calendar.MARCH,19),
                "Guitarra"
        );

        System.out.println(musico);

    }
}
