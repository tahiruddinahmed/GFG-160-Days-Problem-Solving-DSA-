import java.util.ArrayList;
import java.util.Collections;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        // adding elements
        nums.add(45);
        nums.add(2);
        nums.add(5);

        // get an element
        int firstEl = nums.getFirst(); // get the first element
        int el = nums.get(1);
        int lastEl = nums.getLast();
        System.out.println(lastEl);

        // add element in between - at a particular index
        nums.add(2, 50);

        // replacing element - set element
        nums.set(0, 3);

        // delete element
        nums.remove(2);

        // size
        int size = nums.size();

        System.out.println(nums);
        System.out.println(size);

        // loop
//        for(int i = 0; i < nums.size(); i++) {
//            System.out.print(nums.get(i) + " ");
//        }

        // Sort
        Collections.sort(nums);

        System.out.println(nums);
    }
}
