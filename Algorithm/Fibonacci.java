import java.util.Scanner;
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }
    static int fib(int n) {
        int f1 = 0, f2 = 1;
        if (n == 0)
            return f1;
        for (int i = 2; i <= n; i++) {
            int alo = f1;
            f1 = f1 + f2;
            f2 = alo;
        }
        return f1;
    }

    public static void main(String args[]) {
        int n = 8;
        System.out.println(fib(n));
        System.out.print(fibonacci(8));
    }
}

