import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float a = 0;
        float b = 0;
        float c = 0;
        String operation;

        System.out.println("Type 'd' for Division, 's' for Subtraction, 'a' for Some or 'm' for multiplication");
        operation = reader.nextLine();

        System.out.println("Insert the first Number: ");
        a = reader.nextFloat();

        System.out.println("Insert the second number: ");
        b = reader.nextFloat();

        switch (operation) {
            case "a":
                c = Some(a, b);
                break;
            case "s":
                c = Subtraction(a, b);
                break;

            case "d":
                c = Division(a, b);
                break;

            case "m":
                c = Multiplication(a, b);
                break;

            default:
                System.out.println("Invalid operation");
                break;
        }

        System.out.println("Result: " +  c);
    }

    public static float Some (float a, float b) {

        float c = a + b;
        return c;
    }

    public static float Subtraction (float a, float b) {

        float c = a - b;
        return c;
    }

    public static float Multiplication (float a, float b) {

        float c = a * b;
        return c;
    }

    public static float Division (float a, float b) {

        float c = a/b;
        return c;
    }

}
