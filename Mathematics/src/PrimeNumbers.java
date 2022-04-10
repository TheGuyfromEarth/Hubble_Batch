public class PrimeNumbers {

    public static void main(String[] args) {

        int n = 18;
//        System.out.println(isPrime(n));
        System.out.println(numFactors(n));
    }

    public static boolean isPrime(int n){

        for(int i = 2; i<= Math.sqrt(n);i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static int numFactors(int n){
        int count = 0;
        int i;
        for(i = 1; i*i<=n;i++){
            if(n % i == 0) {
                count++;
            }
        }
        count = 2 * count;

        if(n == (i-1)*(i-1)) // checks for perfect square
            count = count -1;
        return count;
    }
}

// While in break, you can think about the algorithm on how to find whether the given
// number is prime or not.

// 12 -> 1,12,2,3,4,6
// 7 -> 1,7



// 18
/*

1 * 18
2 * 9
3 * 6
6 * 3
9 * 2
18 * 1

// 36

1 * 36
2 * 18
3 * 12
4 * 9
6 * 6
9 * 4
12 * 3
18 * 2
36 * 1

2
3
4
5
.
.
.
.
17
*/

/*
49

1 * 49
7 * 7
49 * 1
*/
