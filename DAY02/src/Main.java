
public class Main {
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
        int count = 0;


        for(int i = 0; i < arr.length; i++) {

            if(arr[i] != 0) {
                // swap the value arr[count], arr[i]
                int temp;
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }


    }

}

/*
* Expected Approach - [One Traversal]
*
* The idea is similar to the previous approach where we took a pointer, say count to track where the next non-zero element should be placed.
* However, on encountering a non-zero element, instead of directly placing the non-zero element at arr[count], we will swap element with arr[count].
* This will ensure if there is any zero present at arr[count], it is pushed towards the end of the array and is not overwritten.
*
* */