package numberprogram;

import java.util.Scanner;

public class _9nthPrimeNumber {

	

	    public static boolean isPrime(int n) {
	        if (n <= 1) return false;

	        for (int i = 2; i * i <= n; i++) {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }

	    public static int nthPrime(int n) {
	        int count = 0;
	        int num = 1;

	        while (count < n) {
	            num++;
	            if (isPrime(num)) {
	                count++;
	            }
	        }
	        return num;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter nth value:");
	        int n = sc.nextInt();

	        System.out.println("Nth Prime = " + nthPrime(n));

	        sc.close();
	    }
}
