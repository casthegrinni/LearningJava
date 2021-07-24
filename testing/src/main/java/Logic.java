public class Logic {
    public static void main(String[] args) {
        int ageOne = 10;
        int ageTwo = 5;

        if (ageOne > ageTwo) {
            System.out.println("The first age is bigger than the Second age");
        } else {
            System.out.println("The second age is bigger than the first age");
        }

        int biggestNumber;

        biggestNumber = ageOne > ageTwo? ageOne : ageTwo;
        System.out.println("The biggest age is: " + biggestNumber);
    }
}
