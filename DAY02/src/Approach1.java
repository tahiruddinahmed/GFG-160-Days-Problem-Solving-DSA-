public class Approach1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
//        int[] arr = {10, 20, 30};
//          int[] arr = {0, 0};
        pushZerosToEnd(arr);

        for(int num: arr) {
            System.out.print(num + " ");
        }
    }

    public static void pushZerosToEnd(int[] arr) {
        int size = arr.length;
        int[] newArr = new int[size];

        int e = 0;

        // Push all the non-zero element in the newArr
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                newArr[e++] = arr[i];
            }
        }

        // Fill remaining positions in newArr[] with zeros
        while(e < size) {
            newArr[e++] = 0;
        }

        // Copy all the element from newArr[] to arr[]
        for(int i = 0; i < newArr.length; i++) {
            arr[i] = newArr[i];
        }
    }
}


/*
 * PUSH ALL THE ZERO TO THE END
 *
 * STEP 1: create a new temporary array
 * Step 2: Move all the non-zero element in that array
 * Step 3: Fill all the remaining element with zero
 * Step 4: Copy all the element back to the array from the temporary array
 */
