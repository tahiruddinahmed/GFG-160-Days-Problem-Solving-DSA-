public class Approach2 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Test case 1
//        int[] arr = {10, 5, 10}; // Test case 2
//        int[] arr = {10, 10, 10}; // Test case 3
//        int[] arr = {10};  // Test case 4

        int secondLargest = getSecondLargest(arr);
        System.out.println(secondLargest);
    }

    public static int getSecondLargest(int[] arr) {
        // if array has only one element
        if(arr.length < 2) {
            return -1;
        }

        // Step1: Find the largest element
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Find the second-largest element
        int secMax = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        return secMax;

    }
}

/*
* Approach 2 - Two Pass Search
*
* Step 1: In the first pass FIND the maximum element
* Step 2: In the second pass find the maximum element ignoring the one we found in the first traversal.
*
* Example:
*
* ARR = [12, 35, 1, 10, 34, 1];
*
* First traversal Maximum = 34 (How to find the maximum element of an array?)
* In the Second Traversal
* secMax = -1; (by default)
* for i = 0
*      check if 12 > secMax : secMax = 12
* for i = 1
*      check if 35 > secMax (12) && arr[1] != maximum (False)
*
* for i = 2
*     check if 1 > secMax[12] (FALSE)
*
* for i = 3
*     check if 34 > secMax[12] (true) && arr[3] != maximum (true)
*       secMax = arr[3]   | secMax = 34
*
* */
