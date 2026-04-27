package patternprograms;

import java.util.Scanner;

public class _2 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sc.nextInt();
		System.out.println("Enter number of columns");
		int col = sc.nextInt();
		int n = 5;
		for(int i=1;i<=row; i++) {
			for(int j=1; j<=col; j++) {
				if(i==n || j==1 || i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
