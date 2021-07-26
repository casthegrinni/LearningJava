import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow;

public class TestingArrays {
    public static void main(String[] args) {

        int [] Students = new int[6];
        Students[0] = 102;
        Students[1] = 103;
        Students[2] = 104;
        Students[3] = 108;
        Students[4] = 112;
        Students[5] = 32;

      /*  for(int contador: Students) {
            System.out.println(contador);
        } */

        float studentsTotal = SomeStudents(Students);
        System.out.println("Total of students = " + studentsTotal);
        System.out.println(Students.length);
        System.out.println("Students to String: " + Arrays.toString(Students));
        Arrays.copyOf(Students, 8);
        System.out.println("First number: " + Students[0]);
        System.out.println("New Students length: " + Students.length);
        Arrays.sort(Students);
        System.out.println("Students after sort: " + Arrays.toString(Students));
    }

    public static float SomeStudents(int[] arrayList) {
        float some = 0;
        int arrayLength = arrayList.length;

        for (int i = 0; i < arrayLength; i++) {
            some+= arrayList[i];
        }
        return some;
    }
}
