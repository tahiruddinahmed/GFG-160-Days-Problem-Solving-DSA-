
public class Main {
    public static void main(String[] args) {
//        int[] arr = {2, 1, 5, 4, 3, 0, 0};
//        int[] arr = {2, 4, 1, 7, 5, 0};
        int[] arr = {3, 2, 1};
        nextPermutation(arr);
//        System.out.printf("Hello and welcome!");

        for(int j : arr) {
            System.out.print(j + " ");
        }


    }

    public static void nextPermutation(int[] arr) {
        // find the size of the array
        int n = arr.length;

        int pivot = -1;

        // find arr[i] < arr[i+1]
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                pivot = i;
                break;
            }
        }

        // if pivot is still -1
        if(pivot == -1) {
            // reverse the entire array
            int start = 0;
            int end = n - 1;

            while(start < end) {
                int temp;
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }

        } else {
            // find the greatest elemnt from pivot, but just the nearest greatest
            for(int i = n - 1; i >= pivot; i--) {
                if(arr[i] > arr[pivot]) {
                    // swap
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;

                    break;
                }

            }

            // reverse the array position - after pivot to n - 1

            int start = pivot + 1;
            int end = n - 1;

            while(start < end) {
                int temp;
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }

        }
    }

}