package stringprograms;

public class _37CountNumberofSubstrings {

	public static void main(String[] args) {
		String s = "abc";
		
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			
			for(int j=i; j<s.length(); j++) {
				count++;
			}
		}
		System.out.println(count);
	}
}

// Formula (fastest)
//int n = s.length();
//int count = n * (n + 1) / 2;
//System.out.println(count);