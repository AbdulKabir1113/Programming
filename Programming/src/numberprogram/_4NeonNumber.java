package numberprogram;

import java.util.Scanner;

public class _4NeonNumber {

	public static int isNeon(int n) {
		int sum=0;
		while(n>0) {
			int rem = n%10;
			sum+=rem;
			n/=10;
		
		}
		 return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");		
		int n = sc.nextInt();
		
		int n1 = n*n;
		
		System.out.println(isNeon(n1)==n
				?"Neon Number"
				:"Not a Neon Number");
		
		sc.close();
	}
}
