package arrayprograms;

public class _9PalindromeArray {

	public static boolean isPalindrome(int [] a) {
		
//		System.out.println(a.length);
		int mid = a.length/2;
//		System.out.println(mid);
		for(int i=0,j=a.length-1; i<mid; i++) {
			if(a[i]!=a[j--])
				return false;		
		}
		return true;
	}
	public static void main(String[] args) {
		int [] a= {1,2,3,4,2,1};
		
		if(isPalindrome(a))
			System.out.println("Palindrome Array");
		else
			System.out.println("Not a Palindrome Array");
	}
}
