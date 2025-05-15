
public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 10, 1, 3, 6, 9, 2};
        // find the smallest number
        // check arr[i] < arr[i + 1;
        //      return i;
//        System.out.println("Hello there");
        int res = maximumProfit(arr);
        System.out.println(res);
    }

    public static int maximumProfit(int[] prices) {
        int n = prices.length;

        // find the smallest element from n - 1 th
        // if 7, 10, 1, 3, 6, 9, 2
        // find the smallest element from 0 to n - 1 (5th element)

        int min = prices[0];
        int res = 0, tempRes = 0;
        for(int i = 1; i < n - 1; i ++) {
            // min
            if(prices[i] < min) {
                min = prices[i];
            }

//            tempRes = prices[i] - min;

            if(prices[i] - min > res) {
                res = prices[i] - min;
            }


        }

        return res;

    }
}