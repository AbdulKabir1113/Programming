package arrayprograms;

import java.util.Arrays;

public class _17RightRotateArrayBy1 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		
		int temp=a[a.length-1];
		for(int i=a.length-2; i>=0; i--) {
			
			a[i+1]=a[i];
		}
		a[0]=temp;
		
		System.out.println(Arrays.toString(a));
	}
}
