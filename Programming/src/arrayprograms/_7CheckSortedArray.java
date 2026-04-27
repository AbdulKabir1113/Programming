package arrayprograms;

public class _7CheckSortedArray {

	public static void main(String[] args) {
		int [] arr = {1,2,5,3,4,5};
			
			boolean flag = true;

			for(int i = 0; i < arr.length - 1; i++) {
			    if(arr[i] > arr[i+1]) {
			        flag = false;
			        break;
			    }
			}
		
		if(flag==true)
			System.out.println("Sorted Array");
		else
			System.out.println("Not sorted Array");
	}
}
