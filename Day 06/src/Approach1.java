import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    public static void main(String[] args) {
        // defining array list of Integers
//        int[] inputArray = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        int[] inputArray = {1, 2, 3, 4, 5};
        List<Integer> result = fn(inputArray);
        System.out.println(result);


    }

    public static List<Integer> fn(int[] nums) {
        List<Integer> list = new ArrayList<>();

        // get the size of the list
        int size = nums.length;

        int n = size/3;

        for(int i = 0; i < size; i++) {
            // set a counter variable
            int count = 0;
            int pos = 0;
            for(int j = 0; j < size; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                    pos = j;
                }
            }

            // if count > n
            if(count > n) {
                list.add(nums[i]);
            }
            if(pos > 0) {
                i = pos;
            }
        }


        return list;
    }
}
