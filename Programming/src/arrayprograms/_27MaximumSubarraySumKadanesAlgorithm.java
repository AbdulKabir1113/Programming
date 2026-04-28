package arrayprograms;

public class _27MaximumSubarraySumKadanesAlgorithm {

	public static void main(String[] args) {
		int [] a = {-2,1,-3,4,-1,2,1,-5,4};
		
		int maxSum = a[0];
		int currSum = 0;
		for(int i=0; i<a.length; i++) {
			currSum+=a[i];
			if(currSum>maxSum)
				maxSum=currSum;
			if(currSum<0)
				currSum=0;
		}
		
		System.out.println(maxSum);
	}
}
