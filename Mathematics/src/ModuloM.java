public class ModuloM {

    public static void main(String[] args) {

        int a = 10000000;
        int b = 2;
        int prod = 1;

        for(int i =0;i<b;i++){
            prod = (prod%7*a%7)%7;
        }
//        long a = 100000;
//        int b = 2;
//        long prod = 1;
//
//        for(int i =0;i<b;i++){
//            prod = (prod*a);
//        }
//        System.out.println(prod);
        System.out.println(prod%7);
    }
}

// (a*b)%M = (a%M * b%M)%M

// a^b = 874687^8 in terms of mod 7