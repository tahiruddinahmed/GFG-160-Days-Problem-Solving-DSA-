//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Test case 1
//        int[] arr = {10, 5, 10}; // Test case 2
//        int[] arr = {10, 10, 10}; // Test case 3
//        int[] arr = {10};  // Test case 4

        int secondLargest = getSecondLargest(arr);

        System.out.println(secondLargest);
    }

    public static int getSecondLargest(int[] arr) {
        // return -1 : if array has only one element
        if(arr.length < 2) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        // LOOP through the array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secMax = max;
                max = arr[i];
            }

            if(arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        if(secMax == Integer.MIN_VALUE) {
            return -1;
        } else {
            return secMax;
        }
    }
}