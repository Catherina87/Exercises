package Exercises;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacciSequence(10);
    }

    public static void fibonacciSequence(int numberOfElements) {
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci series of " + numberOfElements + " numbers: ");

        for(int i = 1; i <= numberOfElements; i++) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }


}
