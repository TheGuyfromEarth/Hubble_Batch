// Ex: I/P => n = 4
// O/P => 24 (4*3*2*1)

public class Factorial {

    public static void main(String[] args) {

        int n = 5;
//        int prod = 1;
//        for(int i=1; i<=n;i++){
//            prod *= i; // prod = prod*i;
//        }
//        System.out.println(prod);
        System.out.println(factorial(n));

    }

    public static int factorial(int n) {

        if (n == 0)
            return 1;

        return n * factorial(n - 1);

    }
}
