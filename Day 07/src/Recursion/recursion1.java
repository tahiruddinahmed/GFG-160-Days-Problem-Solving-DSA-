package Recursion;

public class recursion1 {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {

        // when will it stop: Base condition
        if(n > 5) {
            return;
        }

        System.out.println(n);

        // call itself by increasing n by 1
        print(n + 1);
    }
}
