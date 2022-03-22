// Write a recursive function which tells the total number of ears for given number of bunnies.
// Given that if it is an odd number bunny it will have 2 ears but if it is an even number bunny,
// it will have 3 ears.

// Ex: I/P => n = 3
// O/P => 7 (2+3+2)

public class BunnyEars {

    public static void main(String[] args) {

        int numBunnies = 10;
        System.out.println(bunnyEars(numBunnies));
    }

    public static int bunnyEars(int numBunnies){
        if(numBunnies == 0)
            return 0;

        if(numBunnies % 2 == 0)
            return bunnyEars(numBunnies-1)+3; // even number bunny
        else
            return bunnyEars(numBunnies-1)+2;// odd number bunny
    }

}

// n = 3 => 4+2 = 6
// n =2 => 2+2 = 4
// n = 1 => 2
