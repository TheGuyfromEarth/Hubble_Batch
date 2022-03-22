// Write a java method that finds the sum of given first n natural numbers.
// Example: I/P -> n = 5
// O/P -> 15 (5+4+3+2+1)

public class Recursion {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));
    }
//    public static int sum(int n){
//        int sum = 0;
//        for(int i = 1;i<=n;i++){
//            sum += i; // sum = sum+i
//        }
//        return sum;
//    }

    public static int sum(int n){
        if(n == 1) // base condition
            return n;

        return n + sum(n-1);
    }
}

// dry run
// n = 3 => return 3 + 3 = 6
// n = 2 => return 2 + 1 = 3
// n = 1 => return 1


// There are two ways to solve any repetitive problem:
// 1) Iterative way
// 2) Recursive way (when a function calls itself again and again to find a solution for
// a given problem. It uses the concept of breaking the complex problem into it's simplest possible
// problem and using that logic to find solutions for similar problems)

// Recursion will have two major steps:
// 1) Create a simplest possible condition/problem
// 2) Create a recursive equation
