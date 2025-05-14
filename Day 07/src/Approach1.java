public class Approach1 {
    public static void main(String[] args) {
//        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        int[] arr = {4, 2, 2, 2, 4};
        int res = maximumProfit(arr);

        System.out.println(res);
    }

    static int maximumProfit(int[] prices) {
        int n = prices.length;

        int totalProfit = 0;

        int i = 0;
        while(i < n - 1) {

            if(prices[i] < prices[i + 1]) {
                // buying point -> i
                // selling point -> i + 1
                totalProfit += prices[i+1] - prices[i];
            }
            i++;
        }

        return totalProfit;
    }
}
