// Pre-requisite for using binary search: elements need to be sorted

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 14, 25, 46, 77, 99};
        System.out.println(binarySearch(arr, 101));
    }

    public static int binarySearch(int[] arr, int searchValue) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == searchValue)
                return mid;

            else if (arr[mid] > searchValue)
                high = mid - 1;

            else
                low = mid + 1;
        }
        return -1;
    }


}

// 34.83 floor -> 34
// 34.83 ceil -> 35

// 9 -> 3
//     -> 3.xxxx floor -> 3
// 16 -> 4



