import java.util.LinkedList;
import java.util.List;
public class LinkedList_TestClass {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(20);
        list1.add(30);
        list1.add(60);
        list1.add(90);

        list1.remove(2);

        list1.addFirst(10);

        System.out.println(list1);

    }
}
