package arrayprograms;

import java.util.Arrays;

public class _11MergeArray {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] a1 = {6,7,8,9,10};
		int [] res = new int[a.length+a1.length];
		
		for(int i=0; i<a.length; i++) {
			  res[i]=a[i];	
		}
		int j=a.length;
		for(int i=0; i<a1.length; i++) {
			res[j++]=a1[i];
		}
		System.out.println(Arrays.toString(res));
	}
}
