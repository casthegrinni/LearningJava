public class Loopings {
    public static void main(String[] args) {
        int counting = 0;

        /* do {
             counting++;
             System.out.println(counting);
         } while (counting < 10); */

        /*  while(counting < 10) {
            counting++;
            System.out.println(counting);
        } */

        /*   for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        } */

        int [] array = {1, 2, 3};

        for (int counter : array) { // For each -> Para cada posição ele faz algo
            System.out.println(counter);
        }

        for(int i = 0; i < 10; i ++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }

    }
}
