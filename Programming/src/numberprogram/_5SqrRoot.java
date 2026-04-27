package numberprogram;

import java.util.Scanner;

public class _5SqrRoot {

	public static int isSqrRoot(int n) {
		for(int i=0; i<=n/2; i++) {
			if(i*i==n)
				return i;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");		
		int n = sc.nextInt();
		
		System.out.println(isSqrRoot(n));
		sc.close();
	}
}
