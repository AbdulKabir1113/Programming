package numberprogram;

import java.util.Scanner;

public class _13HarshadNumber {
	
//	    A number is a Harshad Number if:
//
//		👉 It is divisible by the sum of its digits
//
//		🧠 Example
//		Input: 18
//		Sum of digits = 1 + 8 = 9
//		18 % 9 = 0 ✅


	public static int isHarshad(int n) {
		int rem=0;
		int sum=0;
		while(n>0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");		
		int n = sc.nextInt();
		
		int sum=isHarshad(n);
		System.out.println(sum!=0 && n%sum==0
				?"Harshad Number"
				:"not a Harshad Number");
		
		sc.close();
	}
}
