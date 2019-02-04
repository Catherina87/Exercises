package Exercises;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4};

        // convert array to string
        System.out.println(Arrays.toString(getReversedArray(a)));
    }

    public static int[] getReversedArray(int[] inputArray) {

        for(int i = 0; i < inputArray.length/2; i++) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - i - 1];
            inputArray[inputArray.length - i - 1] = temp;
        }

        return inputArray;
    }

    // to solve this problem we need to:
    // 1. create a new variable temp;
    // 2. array.length/2
    // 3. last element in the array is array[array.length - 1] BUT in this case we need to write
    // array[array.length - i - 1] it enables us to change the array's elements (first and last, then second and the one
    // before the last one)
}
