package arrayprograms;

import java.util.Arrays;

public class _5ReverseArray {
	
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		
	
		for(int i=0,j=a.length-1; i<j; i++) {
			
			
				int temp = a[i];
				a[i] = a[j];
				a[j]=temp;
				j--;
			
		}
		
		System.out.println(Arrays.toString(a));
	}
}
