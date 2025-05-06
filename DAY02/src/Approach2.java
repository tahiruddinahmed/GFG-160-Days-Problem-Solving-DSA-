public class Approach2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
//        int[] arr = {10, 20, 30};
//          int[] arr = {0, 0};
        pushZerosToEnd(arr);

        for(int n : arr) {
            System.out.print(n + "\t");
        }
    }

    public static void pushZerosToEnd(int[] arr) {
        int size = arr.length;
        int count = 0;

        // Step 1: Shift non-zero elements in the front
        for(int i = 0; i < size; i++) {

            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Fill remaining position with zeros
        while(count < size) {
            arr[count++] = 0;
        }


    }
}

/*
* Approach 2 - [Two Traversals]
*
* Step 1: Shift non-zero elements
*   - count = 0
*   - if the element is non-zero, place it at arr[count] and increment the count value by 1.
*   - Using this when the loop ends, all the non-zero elements will be shifted to the left side.
* Step 2: Fill remaining Positions with zeros
*   - Iterate all the remaining position and fill it with zero
*
* */
