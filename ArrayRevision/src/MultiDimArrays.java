public class MultiDimArrays {

    public static void main(String[] args) {

        int[] scoreEnglish = {64, 87, 77, 90};
        int[] scoreScience = {74, 82, 79, 95};
        int[] scoreMath = {84, 89, 99, 75};

        int[][] scores = {{64, 87, 77, 90},
                {74, 82, 79, 95},
                {84, 89, 99, 75}};

        int max = 0;

//        for(int i=0;i<scoreEnglish.length;i++) {
//            if (scoreEnglish[i] > max)
//                max = scoreEnglish[i];
//        }
//        for(int i=0;i<scoreMath.length;i++) {
//            if (scoreMath[i] > max)
//                max = scoreMath[i];
//        }
        int[][] marks = new int[3][4];
        marks[1][1] = 82;
        marks[2][2] = 99;
        marks[0][3] = 90;

        for (int i = 0; i < scores.length; i++) { // loop for rows
            for (int j = 0; j < scores[i].length; j++) { // loop for columns
                System.out.print(scores[i][j]+" ");
            }
            System.out.println();
        }
        int maximum = 0;
        for (int i = 0; i < scores.length; i++) { // loop for rows
            for (int j = 0; j < scores[i].length; j++) { // loop for columns
                if (scores[i][j] > maximum)
                    maximum = scores[i][j];
            }
        }
        System.out.println(maximum);
    }
}

//   0  1  2  3
//0  64 87 77 90
//1  74 82 79 95
//2  84 89 99 75