// Create an arrayList having integers inside itself. And we need to filter all those
// integers which are divisible by 2 and 5.

import java.util.*;

public class Problem {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        numList.add(10);
        numList.add(5);
        numList.add(20);
        numList.add(15);
        numList.add(25);
        numList.add(40);

        int size = numList.size();

        for(int i=0;i<size;i++){
            int number = numList.get(i);
            if(number%2==0 && number%5==0)
                System.out.print(number+" ");
        }
    }

    public static Collection getList(int num){

        if(num%2 != 0) {
            // return an arraylist
            return new ArrayList();
        }
        else if(num == 0)
        {
            return new HashSet();
        }
        else{
            // return a linked list
            return new LinkedList();
        }
    }

}
