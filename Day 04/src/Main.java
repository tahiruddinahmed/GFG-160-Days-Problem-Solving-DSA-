
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
//        int[] arr = {7, 3, 9, 1};
        int d = 2;

        rotateArr(arr, d);

        for(int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void rotateArr(int[] arr, int d) {
        int n = arr.length;
        d %= n;

        // reverse the first d elements of the array
        reverseArr(arr, 0, d - 1);

        // reverse the n - d elements of the array
        reverseArr(arr, d, n - 1);

        // reverse the entire array
        reverseArr(arr, 0, n - 1);


    }
}