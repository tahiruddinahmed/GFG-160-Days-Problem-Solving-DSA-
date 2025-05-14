
public class Main {
    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};

        int res = maximumProfit(arr);

        System.out.println(res);
    }

    public static int maximumProfit(int[] arr) {
        int n = arr.length;

        int localMin = arr[0];
        int localMax = arr[0];
        int total = 0;

        int i = 0;
        while(i < n-1 ) {
            // need to set the buying point
            while (i < n - 1 && arr[i] >= arr[i + 1]) { i++; }
            localMin = arr[i];

            while(i < n - 1 && arr[i] <= arr[i + 1]) {i++;}
            localMax = arr[i];

            total += localMax - localMin;

        }

        return total;
    }
}