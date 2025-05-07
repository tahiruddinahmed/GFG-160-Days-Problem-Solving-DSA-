
public class Main {
    public static void main(String[] args) {
//         int[] arr = {2, 3, 4, 5, 10, 7, 0};
//         int[] arr = {4, 5, 2};
         int[] arr = {1};
         reverseArr(arr);

         for(int n: arr) {
             System.out.print(n + " ");
         }
    }

    public static void reverseArr(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n / 2; i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}