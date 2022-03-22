public class Test {

    public static void main(String[] args) {
        int[] arr = {6,4,3,4,1};
        kCircleSum(arr, 5, 2);
    }

    static void kCircleSum(int arr[], int n, int k) {
//Enter your code here
        int sum = 0;
        int count = 0;
        int pos = 0;

        for (int i = 0; i < n; i++) {
            if (k == 1)
                System.out.print(arr[i] + " ");
            else {
                sum = 0;
                count = 0;
                pos = i + count;
                sum += arr[pos];
                count = 1;
                while (count != k) {
                    pos = i + count;
                    if (pos >= n)
                        pos = (pos) % n;
                    sum += arr[pos];
                    count++;
                }
                System.out.print(sum + " ");
            }
        }

    }
}

