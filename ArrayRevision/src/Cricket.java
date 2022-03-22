public class Cricket {

    public static void main(String[] args) {

        int[] score = {281, 344, 265, 272, 236, 324, 287};
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }

        int avg = sum / score.length;
        System.out.println("Average is: " + avg);

        int aboveAvg = 0;
        int equalsAvg = 0;
        int belowAvg = 0;

        // for each loop
        for(int anything: score){
            if(anything>avg)
                aboveAvg++;
            else if(anything < avg)
                belowAvg++;
            else
                equalsAvg++;
        }
        System.out.println("Above avg: "+aboveAvg);
        System.out.println("Below avg: "+belowAvg);
        System.out.println("Same as avg: "+equalsAvg);
    }
}
