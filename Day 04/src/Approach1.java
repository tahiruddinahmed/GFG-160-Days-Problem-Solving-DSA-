public class Approach1 {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 1};
        int d = 4;

        rotateArr(arr, d);

        for(int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void rotateArr(int[] arr, int d) {
        int n = arr.length;


        int count = 0;
        while(count < d) {
            int firstEl = arr[0];
            int targetEl = 1;
            for(int i = 0; i < n-1; i++) {
                arr[i] = arr[targetEl++];
            }

            arr[n-1] = firstEl;
            count++;
        }





    }
}
