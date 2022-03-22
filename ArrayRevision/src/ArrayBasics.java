public class ArrayBasics {

    public static void main(String[] args) {

//        int[] scores = {10, 20, 40, 30};
//        int scores1[] = {20, 90, 78, 37};
//
//        int scores2[] = new int[]{5, 77, 33, 88, 33};
//
//        String[] arr = new String[10];

//        int var = null;
//        String var1= null;
//        ArrayBasics obj = null;
//        Double obj1 = null;

        Integer[] myArray = {33, 56, 77};
//        myArray = null;
//        myArray[0] = null;

        String[] students = {"Jack", "Ravi", "Dipak"};

        String[] students1 = new String[students.length + 1];

        for (int i = 0; i < students.length; i++)
            students1[i] = students[i];

        students = null;

        students1[students1.length - 1] = "Stephannie";

        System.out.println(students1);

//        for (int i = 0; i < students1.length; i++) {
//            System.out.print(students1[i] + " ");
//        }

        // enhanced for loop or for each loop

        for(String st : students1)
            System.out.print(st+" ");


    }
}
