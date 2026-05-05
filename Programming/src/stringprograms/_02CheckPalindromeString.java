package stringprograms;

public class _02CheckPalindromeString {

	public static void main(String[] args) {
		String s = "racecar";
		boolean check = true;
		for(int i=0,j=s.length()-1; i<=s.length()/2; i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				System.out.println("Not a Plindrome String");
				check = false;
				break;
			}
		}
		
		if(check)
			System.out.println("Palindrome String");
	}
}
