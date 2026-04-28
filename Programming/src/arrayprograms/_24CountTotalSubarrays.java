package arrayprograms;

public class _24CountTotalSubarrays {



	    public static void main(String[] args) {

	        int[] a = {1, 2, 3};

	        int count = 0;

	        for (int i = 0; i < a.length; i++) {
	            for (int j = i; j < a.length; j++) {
	                count++; // each (i, j) is one subarray
	            }
	        }

	        System.out.println("Total Subarrays = " + count);
	    }
	
}
