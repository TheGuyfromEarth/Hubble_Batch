import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {40, 10, 50, 16, 67, 39, 12, 90};

//        int[] arr = {39, 10, 12, 16, 40, 67, 50, 90}; // after 1st partition

        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) { // we only sort if there are more than 1 elements

            int j = partition(arr, low, high); // returns pos of pivot
            quickSort(arr, low, j - 1); // recursion (left side of pivot)
            quickSort(arr, j + 1, high); // recursion (right side of pivot)

        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i < j)
                swap(arr, i, j);
        }
        swap(arr, low, j);

        return j;
    }

    public static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
