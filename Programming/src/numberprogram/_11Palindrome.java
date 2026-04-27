package numberprogram;

import java.util.Scanner;

public class _11Palindrome {

	
		public static int isPalindrome(int n) {
			
			int rem=0;
			int rev=0;
			
			while(n>0) {
				rem=n%10;
				rev=rev*10+rem;
				n/=10;
			}
			return rev;
		}
		
		public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a number");
		        int n = sc.nextInt();
		        int temp = n;
		        
		        System.out.println(isPalindrome(temp)==n
		        		?"Palindrome"
		        		:"Not a Palindrome");
		        
		        sc.close();
	}
}
