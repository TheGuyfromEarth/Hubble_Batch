// Write a recursive function that finds a^b (given that b is a positive number)
// I/P -> a = 2, b = 3
// O/P -> 8

public class Recursion {

    public static void main(String[] args) {
        System.out.println(power(3,4));
    }

    public static int power(int base, int exponent){
        if(exponent == 0)
            return 1;
        return power(base,exponent-1)*base; // recursive equation
    }

    // return fib(n-1)+fib(n-2)+fib(n-3)
}

// Iterative way (loops)
// Recursive way
    // -> 1) Need a function for recursion which will be calling itself
    // -> 2) Base condition -> Can lead to StackOverFlow Error if the base condition is incorrect
    // -> 3) Recursive Equation -> call the same function, making sure that we are reaching towards the base condition

// 2^3 = 2*2*2*1 = 8

// 2^3 = 4*2
// power(2,2) = 2*2
// power(2,1) = 1*2
// power(2,0) = 1
