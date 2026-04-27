package numberprogram;

import java.util.Scanner;

public class _15TechNumber {

    // Count digits
    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Check Tech Number
    public static boolean isTech(int n) {

        int digits = count(n);

        // Step 1: check even digits
        if (digits % 2 != 0)
            return false;

        // Step 2: find divisor without Math.pow()
        // int divisor = (int) Math.pow(10, digits / 2); inbuilt method
        int divisor = 1;
        for (int i = 1; i <= digits / 2; i++) {
            divisor *= 10;
        }

        // Step 3: split number
        int first = n / divisor;
        int second = n % divisor;

        // Step 4: check condition
        int sum = first + second;

        return sum * sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        System.out.println(isTech(n)
                ? "Tech Number"
                : "Not a Tech Number");

        sc.close();
    }
}