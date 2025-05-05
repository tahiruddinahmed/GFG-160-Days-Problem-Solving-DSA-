import java.util.Arrays;

public class Approach1 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Test case 1
//        int[] arr = {10, 5, 10}; // Test case 2
//        int[] arr = {10, 10, 10}; // Test case 3
//        int[] arr = {10};  // Test case 4
        int secondLargest = getSecondLargest(arr);

        System.out.println((secondLargest));
    }

    public static int getSecondLargest(int[] arr) {
        // if array has only one element
        if(arr.length < 2) {
            return -1;
        }

        // sort the array in ascending order
        Arrays.sort(arr);

        // Step 2: largest element
        int max = arr[arr.length - 1];

        // Step 3: Loop through the array from n - 2 to 0
        for (int i = arr.length - 2; i >= 0 ; i--) {
            // Step 4:
            if(arr[i] != max) {
                return arr[i]; // Return & exit the loop
            }
        }

        return -1; // if element not found
    }
}

/*
* APPROACH 1
*
* TO FIND THE 2ND LARGEST ELEMENT
*
* Step 1: sort the array in ascending order
* Step 2: The largest element lies in the n - 1 th position
* Step 3: Loop the array backward from n - 2 to 0
* Step 4: The moment we found an element which is not equal to the largest return that element as second largest.
* Step 5: If all the elements are equal to the largest element, return -1.
* */
