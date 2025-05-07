public class Approach1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 10, 7, 0};
//         int[] arr = {4, 5, 2};
//        int[] arr = {1};
        reversedArr(arr);

        for(int n: arr) {
            System.out.print(n + " ");
        }
    }
    public static void reversedArr(int[] arr) {
        int n = arr.length;
        // create a temporary array of same size as the original array
        int[] tempArr = new int[n];

        int count = 0;
        for(int i = n - 1; i > 0; i --) {
            tempArr[count++] = arr[i];
        }

        for(int i = 0; i < tempArr.length; i++) {
            arr[i] = tempArr[i];
        }
    }
}

/*
Approach 1

The idea is to create a temporary array move the element from the original array in reversed order

Step 1: Create a temporary array of the same size as the original array
Step 2: Copy all the element from the original array in reversed order in temporary array
Step 3: Then again copy all the element from the temporary array back to the original array


 */
