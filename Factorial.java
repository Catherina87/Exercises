package Exercises;

public class Factorial {
    public static void main(String[] args) {
        calculateFactorial(5);
        maxChar(254);
    }

    public static void calculateFactorial(int number) {

        int factorial = 1;
        for(int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " equals: " + factorial);
    }

    public static void maxChar (int numberOfChars) {
        for(int i = 0; i < numberOfChars; i++) {
            System.out.print("v");
        }
    }
}
