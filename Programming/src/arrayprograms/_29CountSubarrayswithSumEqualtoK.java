package arrayprograms;

public class _29CountSubarrayswithSumEqualtoK {
 
	public static void main(String[] args) {
		int [] a = {1,2,3,1,1,1};
		int	target = 3;
		int count = 0;
		for(int i=0; i<a.length; i++) {
			int sum=0;
			for(int j=i; j<a.length; j++) {
				sum+=a[j];
				
				if(sum==target)
					count++;
			}
		}
		System.out.println(count);
	}
}
