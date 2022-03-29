import java.util.Arrays;

public class StringClassDemo {

    public static void main(String[] args) {

//        int[] arr = {12,45,67,77};
//        System.out.println(arr.length);
        String str = "$Good Evening to everyone";

        // returns the total number of characters
//        System.out.println(str.length());

        // changes the case to desired type
//        System.out.println(str.toLowerCase());

        // substring returns the desired part of string
//        System.out.println(str.substring(6));
//        System.out.println(str.substring(1,5));

        // returns the number of words in a sentence
//        String[] words = str.split(" ");
//        System.out.println(Arrays.toString(words));
//        System.out.println(words.length);

        String userName = "      User123          ";
//        System.out.println(userName.length());
////        System.out.println(userName.stripLeading());
//        System.out.println(userName.stripTrailing());
//        System.out.println(userName.stripTrailing().length());
//        System.out.println(userName.strip());
//        System.out.println(userName.trim());

//        String[] names = {"Mr Kumar","Miss McKeon","Mr Jain","Miss Jain"};
//
//        for(String element : names){
////            if(element.startsWith("Mr"))
////                System.out.println(element);
//            if(element.endsWith("Jain"))
//                System.out.println(element);
//        }

        // If the given two strings are equal to each other or not
//        String str1 = "Baseball";
//        String str2 = "Baseball";
//        String str3 = new String("Baseball");
//
////        System.out.println(str1==str2); // true
////        System.out.println(str2==str3); // false
////        System.out.println(str1.equals(str2)); // true
//        System.out.println(str2.equals(str3)); // true

        // String class is a an immutable class
        // Immutable class -> Those classes where once you create an object,
        // String class checks if already an object is present with same value,
        // if yes, then it returns the previous object, else it creates a new object with
        // the given value

        // example: String a = "Some Value"
        //          String b = "New Value"
        //          String c = "Some Value"

        String sentence = "Java is a fun language";
//        sentence = sentence.toUpperCase();
//        System.out.println(sentence); // output ? 1) Original 2) Uppercase

        // StringBuilder class is a mutable class
//        StringBuilder sb = new StringBuilder(sentence);
//        sentence = sb.reverse().toString();
//        System.out.println(sentence);

//        String firstName = "Jack";
//        String lastName = "Wilson";
//        String fullName = firstName + " " + lastName;
//
//
//        fullName = new StringBuffer(firstName).append(" ").append(lastName).toString();
//        System.out.println(fullName);



    }
}
