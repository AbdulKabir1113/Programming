package stringprograms;

public class _07CountDigitsinaString {

	public static void main(String[] args) {
		String s = "abc123def456";
		int count=0;
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) >= '0' && s.charAt(i)<= '9')
				count++;
		}
		System.out.println(count);
	}
}
