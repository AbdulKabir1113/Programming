package numberprogram;

import java.util.Scanner;

public class _14DuckNumber {
	
//	A number is a Duck Number if:
//
//	It contains 0
//	But not at the starting
//	🧠 Example
	
//	1023 ✅ Duck
//	0123 ❌ Not Duck
	
	
	
	public static boolean isDuck(int n) {

	    while (n > 0) {
	        int rem = n % 10;

	        if (rem == 0)
	            return true;

	        n /= 10;
	    }

	    return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        
        System.out.println(isDuck(n)
        		?"is a Duck Number"
        		:"not a Duck Number");
        sc.close();
	}
}
