package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class _1SumOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		int sum=0;
		for(int i : arr) {
			sum=sum+i;
		}
		System.out.println(sum);
		sc.close();
	}
}
