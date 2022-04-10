public class GCD {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        System.out.println(GCD(a,b));

    }

    public static int GCD(int a,int b){
        if(b == 0)
            return a;

        return GCD(b,a%b);
    }
}

// GCD (HCF)
// Sieve of Eratosthenes
// Modulo M



// 12 and 18

// 12 -> 2*2*3
// 18 -> 2*3*3

// Euclid's Algorithm
