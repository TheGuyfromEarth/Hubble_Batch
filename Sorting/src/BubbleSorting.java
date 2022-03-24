public class BubbleSorting {

    public static void main(String[] args) {

        int[] arr = {78, 5, 29, 46, 66};

        for (int i = 0; i < arr.length-1; i++) { // loop for passes
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSwapped = true;
                    swap(arr, j);
                }
            }
            if(!isSwapped)
                break;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int arr[], int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}
