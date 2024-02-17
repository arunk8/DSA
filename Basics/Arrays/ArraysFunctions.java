package Arrays;

import java.util.Arrays;

public class ArraysFunctions {
    public static void main(String[] args) {
        // Initializing an array
        int[] numbers = {5, 2, 8, 1, 9, 3, 7, 4, 6};
        
        // Printing the array
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        
        // Finding the index of an element
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("Index of 7 in the sorted array: " + index);
        
        // Filling the array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled array: " + Arrays.toString(filledArray));
        
        // Copying an array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
        
        // Checking for array equality
        boolean isEqual = Arrays.equals(numbers, copiedArray);
        System.out.println("Are the original and copied arrays equal? " + isEqual);
        
        // Converting an array to a string
        String arrayString = Arrays.toString(numbers);
        System.out.println("Array as string: " + arrayString);
    }
}
