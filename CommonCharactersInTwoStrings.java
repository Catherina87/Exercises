package Exercises;

import java.util.HashSet;
import java.util.Set;

public class CommonCharactersInTwoStrings {

    // find unique common characters in two given strings

    public static void main(String[] args) {

        System.out.println(getCommonCharacters("Kate", "Kat"));

    }

    public static String getCommonCharacters(String inputString1, String inputString2) {

        // check for the following conditions: strings cannot be null or empty; strings can be <= 20 chars;

        if(inputString1 == null || inputString2 == null) {
            throw new IllegalArgumentException("Input string caanot be null");
        }

        if(inputString1.equals("") || inputString2.equals("")) {
            throw new IllegalArgumentException("Input string cannot be empty");
        }

        if(inputString1.length() > 20 || inputString2.length() > 20) {
            throw new IllegalArgumentException("Input string cannot be greater than 20 characters");
        }

        // convert both strings to arrays of characters

        char[] charArray1 = inputString1.toCharArray();
        char[] charArray2 = inputString2.toCharArray();

        // create an empty Set holder to store unique characters (Set does not allow duplicates!!)

        Set<Character> charSet = new HashSet<Character>();

        for(char c1 : charArray1) {
            for(char c2 : charArray2) {
                if(c1 == c2) {
                    charSet.add(c1);
                }
            }
        }

        // create StringBuilder and loop through your HashSet

        StringBuilder sb = new StringBuilder();

        for(Character cc : charSet) {
            sb.append(cc);
        }

        return sb.toString();
    }
}
