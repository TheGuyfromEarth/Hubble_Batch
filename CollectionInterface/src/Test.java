import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Test obj = new Test();

        // creating an arrayList
        ArrayList<String> groceryList = new ArrayList();

        groceryList.add("Spinach");
        groceryList.add("Mango");
        groceryList.add("Brinjal");
        groceryList.add("apples");

        groceryList.remove("Brinjal");

        groceryList.add(0,"Chocolates");

//        groceryList.add(2648);
//        groceryList.add(true);
//        groceryList.add(26);
//        groceryList.add('A'4.7746724);
//        groceryList.add(obj);



        ArrayList<String> duplicateGroceryList = new ArrayList();

        duplicateGroceryList.addAll(groceryList);

//        duplicateGroceryList.clear();
//        System.out.println(duplicateGroceryList.contains("chocolates"));
//        System.out.println(duplicateGroceryList.isEmpty());
//        System.out.println(duplicateGroceryList.size());

        String[] groceryArray = groceryList.toArray(new String[0]);

        System.out.println(groceryList);

        System.out.println(groceryList.get(1));


        ArrayList<Double> heights = new ArrayList();


    }
}
