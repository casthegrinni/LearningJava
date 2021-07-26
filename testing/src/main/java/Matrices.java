import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriceVar = new int [2][2];
        matriceVar[0][0] = 1;
        matriceVar[0][1] = 2;
        matriceVar[1][0] = 3;
        matriceVar[1][1] = 4;

        System.out.println("Position 0: " + Arrays.toString(matriceVar[0]) );
        System.out.println("Position 1: " + Arrays.toString(matriceVar[1]) );
    }
}
