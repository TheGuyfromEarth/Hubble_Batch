// Write a java problem that finds the maximum element in array
// I/P: arr = {32,44}
// O/P: 77

public class RecursionProblem {

    public static void main(String[] args) {
        int[] arr = {23,4,66,11};
        System.out.println(maxElement(arr,arr.length));
    }

    public static int maxElement(int[] arr, int len){
        if(len == 1)
            return arr[0];

        return max(maxElement(arr,len-1),arr[len-1]);
    }

    public static int max(int a,int b){
//        if(a>b)
//            return a;
//        else
//            return b;

       return  a>b ? a:b;
    }
}

// maxElement({11,31,5},3) => maxElement(arr,2)
// maxElement({11,31,5},2) => maxElement(arr,1)
