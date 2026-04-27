package arrayprograms;

public class _42ndLargestElement {
	
	public static void main(String[] args) {
		int []a = {1,2,8,3,4,5};
		
		int l1=Integer.MIN_VALUE;
		int l2=Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++) {
			
			if(l1<a[i]) {
				l2=l1;
				l1=a[i];
			}
			else if(l2<a[i] && l1!=a[i])
				l2=a[i];	
		}
		
		System.out.println(l2);
	}
}
