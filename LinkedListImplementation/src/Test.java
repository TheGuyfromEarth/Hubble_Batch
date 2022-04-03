public class Test {

    public static void main(String[] args) {

        MyLinkedList myList = new MyLinkedList();

//        System.out.println(myList.isEmpty());

        System.out.println(myList.size()); // 0

//        myList.remove(90);

        myList.add(10);
        myList.add(20);
        myList.add(24);

//        System.out.println(myList.size()); // 3

        myList.add(11);
        myList.add(99);

        myList.remove(11);

//        System.out.println(myList.size()); // 5
        myList.display();
        System.out.println();

//        System.out.println(myList.get(4));
//        System.out.println(myList.isEmpty());
    }
}
