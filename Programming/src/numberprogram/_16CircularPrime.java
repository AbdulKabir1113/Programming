package numberprogram;

import java.util.Scanner;

public class _16CircularPrime {

    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isCircularPrime(int n) {

        int digits = count(n);

        // find divisor
        int divisor = 1;
        for (int i = 1; i < digits; i++) {
            divisor *= 10;
        }

        int temp = n;

        for (int i = 1; i <= digits; i++) {

            // check prime
            if (!isPrime(temp))
                return false;

            // rotate
            temp = (temp % 10) * divisor + (temp / 10);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println(isCircularPrime(n)
                ? "Circular Prime"
                : "Not a Circular Prime");

        sc.close();
    }
}