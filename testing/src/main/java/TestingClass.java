public class TestingClass {
    public static void main(String[] args) {
        String name = "Brunno Costa Castegrini";
        String [] split = name.split((" "));
        System.out.println("Full name: " + name);
        int last = (split.length) - 1;

        System.out.println("Hello, " + split[0] + " " + split[last] + "!");

        String firstString = "25";
        String secondString = "1.5";
        String thirdString = "7.3";

        int firstNumber = Integer.parseInt(firstString);
        float secondNumber = Float.parseFloat(secondString);
        double thirdNumber = Double.parseDouble(thirdString);

        System.out.println("1ª:"+firstNumber+ "  2ª:" + secondNumber + "  3ª:" + thirdNumber);
    }
}
