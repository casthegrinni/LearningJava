// Calculator

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float firstNumber = 5;
        float secondNumber = 2;
        float result = 0;
        String operationType = "a";

        System.out.println("Operation type (d = division, m = multiplication, s = subtraction, a = addiction");
        operationType = reader.nextLine();

        System.out.println("First number: ");
        firstNumber = reader.nextInt();

        System.out.println("Second number: ");
        secondNumber = reader.nextInt();

        switch (operationType) {
            case "a":
                result = firstNumber + secondNumber;
                System.out.println("Operation result: " + result);
                break;

            case "s":
                result = firstNumber - secondNumber;
                System.out.println("Operation result: " + result);
                break;

            case "m":
                result = firstNumber * secondNumber;
                System.out.println("Operation result: " + result);
                break;

            case "d":
                result = firstNumber / secondNumber;
                System.out.println("Operation result: " + result);
                break;

            default:
                System.out.println("Invalid operation");
        }

    }
}
