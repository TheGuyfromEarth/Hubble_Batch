import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {12, 23, 51, 2, 18};

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}