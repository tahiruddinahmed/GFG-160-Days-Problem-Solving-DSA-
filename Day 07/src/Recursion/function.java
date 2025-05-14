package Recursion;

public class function {
    public static void main(String[] args) {
        int n = 1;
        print(n);
    }
    static void print(int n) {
        System.out.println(n);
        print1(n + 1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(n + 1);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(n + 1);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(n + 1);
    }
    static void print4(int n) {
        System.out.println(n);
    }
}
