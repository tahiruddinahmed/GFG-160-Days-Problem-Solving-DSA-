package Recursion;

public class Factorial {

    public static void main(String[] args) {
        int fact1 = fact(7);
        System.out.println(fact1);
//        System.out.println("Hello there");
    }

    public static int fact(int n) {
        // fact(n) = n * fact(n - 1); until n > 0
        if(n <= 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

}
