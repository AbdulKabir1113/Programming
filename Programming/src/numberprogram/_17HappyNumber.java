package numberprogram;

import java.util.Scanner;

public class _17HappyNumber {

    public static boolean isHappy(int n) {

        while (n != 1 && n != 4) {

            int sum = 0;   // reset every time

            while (n > 0) {
                int rem = n % 10;
                sum += rem * rem;
                n /= 10;
            }

            n = sum;   // update n
        }

        return n == 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println(isHappy(n)
                ? "Happy Number"
                : "Not a Happy Number");

        sc.close();
    }
}