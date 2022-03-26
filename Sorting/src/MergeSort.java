import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {12, 3, 66, 89, 34, 19, 78};

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) // atleast we have two elements in array
        {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, mid, low, high);
        }
    }

    public static void merge(int[] arr, int mid, int low, int high) {
        int[] tempArr = new int[arr.length];

        int i = low;
        int j = mid + 1;
        int k = low; 

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                tempArr[k] = arr[i];
                i++;
            } else {
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }

        while (j <= high) {
            tempArr[k] = arr[j];
            j++;
            k++;
        }

        while (i <= mid) {
            tempArr[k] = arr[i];
            i++;
            k++;
        }


        for (int z = low; z <= high; z++)
            arr[z] = tempArr[z];

    }
}
