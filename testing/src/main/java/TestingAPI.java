import java.util.ArrayList;
import java.util.List;

public class TestingAPI {

    public static void main(String[] args) {
      List<String> arrayList = new ArrayList<String>();

      arrayList.add(0, "Hello world");
      int testingOn = arrayList.indexOf("Hello world");
      String abc = arrayList.get(0);

      List<String> newArrayList = new ArrayList<String>();

      newArrayList.add("Olá");
      newArrayList.add("Lala");
      newArrayList.add("Cicer");
      newArrayList.add("O");
      newArrayList.add("Hellow");
      newArrayList.add("Zigzagoon");

      int arraySize = newArrayList.size();
        System.out.println("Showing all itens: " + newArrayList + "... Array size: " + arraySize);

        System.out.println(abc);
        System.out.println(testingOn);
    }
}
