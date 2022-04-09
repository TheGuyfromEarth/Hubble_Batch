// Search Algorithms:
// 1) Linear Search
// 2) Binary Search

public class Search {

    public static void main(String[] args) {
        int[] arr = {24,55,67,12,87};
        int searchVal = 24;
        boolean isFound = false;
        int i=0;

        for(i=0;i<arr.length;i++)
        {
            if(arr[i] == searchVal)
            {
                isFound = true;
                break;
            }
        }
        if(isFound)
            System.out.println("Element found at index:"+i);
        else
            System.out.println("Element not found");
        System.out.println(Integer.MAX_VALUE);
    }


}

// mid = (low+high)/2
// mid = (low + high + low - low)/2
// mid = (2low + high - low)/2
// mid = low + (high-low)/2


// 108749493