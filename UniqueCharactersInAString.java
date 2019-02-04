package Exercises;

import java.util.Set;
import java.util.HashSet;

public class UniqueCharactersInAString {
    
    public static void main(String[] args) {
        System.out.println(findUniqueCharacters("Sergei"));
    }

    public static String findUniqueCharacters(String inputString) {
        if(inputString == null) {
            throw new IllegalArgumentException("Input String cannot be null");
        }

        if(inputString.equals("")) {
            return "";
        }

        if(inputString.length() > 20) {
            throw new IllegalArgumentException("Input String cannot be greater than 20 characters");
        }

        char[] charArray = inputString.toCharArray();

        Set<Character> storageOfUniqueChars = new HashSet<Character>();

        for(Character putingCharsInTheSet : charArray) {
            storageOfUniqueChars.add(putingCharsInTheSet);
        }

        StringBuilder sb = new StringBuilder();

        for(Character puttingFromSetToStringBuilder: storageOfUniqueChars) {
            sb.append(puttingFromSetToStringBuilder);
        }

        return sb.toString();
    }
}
