package numberprogram;

import java.util.Scanner;

public class _12AutomorphicNumber {


	    public static boolean automorphic(int sqr, int n) {
	        while (n > 0) {
	            int rem = sqr % 10;
	            int rem1 = n % 10;

	            if (rem != rem1)
	                return false;

	            n /= 10;
	            sqr /= 10;
	        }
	        return true;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number");
	        int n = sc.nextInt();

	        System.out.println(automorphic(n * n, n)
	                ? "Automorphic Number"
	                : "Not an Automorphic Number");

	        sc.close();
	    }
}
