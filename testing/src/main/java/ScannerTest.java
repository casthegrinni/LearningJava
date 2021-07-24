import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Write a number: ");
        int firstNumber = reader.nextInt();

        System.out.println("Write another number: ");
        int secondNumber = reader.nextInt();

        int some = firstNumber + secondNumber;

        System.out.println("Some = " + some);
    }
}
