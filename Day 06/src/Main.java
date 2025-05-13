import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // defining array list of Integers
        int[] inputArray = {2, 1, 6, 6, 6, 6, 6, 5, 5, 5, 5};
//        int[] inputArray = {1, 2, 3, 4, 5};
        List<Integer> result = fn(inputArray);
        System.out.println(result);


    }

    public static List<Integer> fn(int[] nums) {
        List<Integer> list = new ArrayList<>();

        // get the size of the list
        int size = nums.length;

        int n = size/3;

        int cand1 = -1, cand2 = -1;
        int count1 = 0, count2 = 0;
        for(int i = 0; i < size; i++) {
            // check if elements are equal to cand1 or cand2
            if(nums[i] == cand1) {
                // increment count1++;
                count1++;
            } else if(nums[i] == cand2) {
                count2++;
            }// check the counter
            else if(count1 == 0) {
                cand1 = nums[i];
                count1++;
            } else if (count2 == 0) {
                cand2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }


        }

        count1 = 0;
        count2 = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == cand1) {
                count1++;
            }

            if(nums[i] == cand2) {
                count2++;
            }
        }

        if(count1 > n) {
            list.add(cand1);
        }
        if(count2 > n) {
            list.add(cand2);
        }

        Collections.sort(list);

        return list;
    }
}