package arrayprograms;

public class _21FrequencyofElements {

	    public static void main(String[] args) {

	        int[] a = {1, 2, 3, 2, 1, 3, 3};

	        for (int i = 0; i < a.length; i++) {

	            // Step 1: check if already processed
	            boolean isDuplicate = false;

	            for (int k = 0; k < i; k++) {
	                if (a[i] == a[k]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (isDuplicate)
	                continue;

	            // Step 2: count frequency
	            int count = 0;

	            for (int j = 0; j < a.length; j++) {
	                if (a[i] == a[j]) {
	                    count++;
	                }
	            }

	            // Step 3: print result
	            System.out.println(a[i] + " -> " + count);
	        }
	    
	}
}
