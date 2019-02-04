package Exercises;

public class ReverseAString {
    public static void main(String[] args) {
        reverseGivenString("Kate");
        countOnlyLetters("Kate 87 Sergei 92");
        multiplicationTable();
        reverseGivenString("Igor");

    }

    public static void reverseGivenString(String input) {
        String result = "";
        for(int i = 0; i < input.length(); i++) {
            result = input.charAt(i) + result;

        }
        System.out.print(result + " ");


    }

    public static void countOnlyLetters(String phrase) {
        int count = 0;
        for(int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if(Character.isLetter(ch)) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
    }

    public static void multiplicationTable() {
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}
