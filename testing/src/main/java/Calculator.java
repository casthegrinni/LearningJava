import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float a = 0;
        float b = 0;
        String operation;

        System.out.println("Insert the first Number: ");
        a = reader.nextFloat();

        System.out.println("Insert the second number: ");
        b = reader.nextFloat();

        System.out.println("Type 'd' for Division, 's' for Subtraction, 'a' for Some or 'm' for multiplication");
        operation = reader.nextLine();


        switch (operation) {
            case "a":
                Some(a, b);
            case "s":
                Subtraction(a, b);
            case "d":
                Division(a, b);
            case "m":
                Multiplication(a, b);
        }
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

        float c = a*b;
        return c;
    }

    public static float Division (float a, float b) {

        float c = a/b;
        return c;
    }
}
