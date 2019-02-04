package Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfOccurrences {

    // Task: calculate the number of times each character occurs in a given string and return it as a string

    public static void main(String[] args) {

        System.out.println(getCharsAndNumberTheyOccurredInString("Katty"));

    }

    public static String getCharsAndNumberTheyOccurredInString(String inputString) {

        if(inputString == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        if(inputString.equals("")) {
            throw new IllegalArgumentException("String cannot be empty");
        }

        if(inputString.length() > 20) {
            throw new IllegalArgumentException("String cannot be greater than 20 chars");
        }

        // convert string to array of characters:

        char[] charsFromS1 = inputString.toCharArray();

        // create an empty HashMap to store chars (as a key) and the number they occur (as a value)

        Map<Character, Integer> hash_map = new HashMap<Character, Integer>();

        // loop through the array of chars and put the chars and the number of their occurrence in the HashMap

        for(char c : charsFromS1) {
            if(!hash_map.containsKey(c)) {
                hash_map.put(c, 1);
            } else{
                hash_map.put(c, hash_map.get(c) + 1);
            }
        }

        // now that we have filled out our HashMap, we need to create a StringBuilder;
        // then we need to loop through through the HashMap

        StringBuilder sb = new StringBuilder();

        // use entrySet to loop through HashMap
        Set<Map.Entry<Character, Integer>> entry = hash_map.entrySet();

        for(Map.Entry<Character, Integer> e : entry) {
            sb.append(e.getKey());
            sb.append(e.getValue());
        }

        return sb.toString();
    }
}
