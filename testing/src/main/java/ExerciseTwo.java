public class ExerciseTwo {
    public static void main(String[] args) {
        int [] myArrayList = {10, 7, 6, 6, 5, 9, 6, 8, 5, 9};

        float media = Media(myArrayList);
        int aboveMedia = AboveMedia(media, myArrayList);

        System.out.println("Average: " + media);
        System.out.println("Number of students: " + myArrayList.length);
        System.out.println("Students above media: " + aboveMedia);
    }

    public static float Media(int[] arrayList) {
        float newArrayList = 0;
        float arraySome = 0;
        int arrayLength = arrayList.length;


        for (int i = 0; i < arrayLength; i++) {
            arraySome += arrayList[i];
        }

        newArrayList = arraySome / arrayLength;
        return newArrayList;
    }
    public static int AboveMedia (float media, int [] arrayList) {
        int aboveMediaStudents = 0;

        for(int i : arrayList){
            System.out.println(i);
            if (i > media) {
                aboveMediaStudents++;
            }
        }
        return aboveMediaStudents;
    }
}
