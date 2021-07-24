import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cases = 0;

        System.out.println("1 for 'Hello', 2 for 'Olá', 3 for 'Ciao' ");
        cases = reader.nextInt();

        switch (cases) {

            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Olá");
                break;

            case 3:
                System.out.println("Ciao");
                break;

            default:
                System.out.println("Value not found");
        }
    }
}