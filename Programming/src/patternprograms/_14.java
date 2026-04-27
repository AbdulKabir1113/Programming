package patternprograms;

import java.util.Scanner;

public class _14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();

        int col = 2 * n - 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= col; j++) {

                if (j >= n - i + 1 && j <= n + i - 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        sc.close();
    }
}