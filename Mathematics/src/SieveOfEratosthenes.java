import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int n = 20;
        boolean[] arr = new boolean[n+1];

        Arrays.fill(arr,true);

        for(int i = 2;i*i <= arr.length;i++){
            if(arr[i] == true){
                for(int j = i; j*i<=n;j++){
                    arr[j*i] = false;
                }
            }
        }
        for(int k = 2;k<arr.length;k++)
        {
            if(arr[k] == true)
                System.out.print(k + " ");
        }
    }
}

// 2    3   4   5   6   7   8   9   10  11  12  13  14  15
// p    p       p       p                p       p
