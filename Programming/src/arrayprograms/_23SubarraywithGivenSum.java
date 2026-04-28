package arrayprograms;

public class _23SubarraywithGivenSum {
	

	    public static void main(String[] args) {

	        int[] a = {1, 2, 3, 7, 5};
	        int target = 12;

	        for (int i = 0; i < a.length; i++) {

	            int sum = 0;

	            for (int j = i; j < a.length; j++) {

	                sum += a[j];

	                if (sum == target) {

	                    System.out.print("Subarray: ");

	                    for (int k = i; k <= j; k++) {
	                        System.out.print(a[k] + " ");
	                    }

	                    return; // stop after first match
	                }
	            }
	        }

	        System.out.println("No subarray found");
	    }
	
}
