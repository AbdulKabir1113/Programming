package stringprograms;

public class _28CountUppercaseandLowercaseSeparately {

	public static void main(String[] args) {

		String s = "Hello World";

		int uCount = 0;
		int lCount = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= 'A' && ch <= 'Z')
				uCount++;

			else if (ch >= 'a' && ch <= 'z')
				lCount++;
		}

		System.out.println("Uppercase: " + uCount);
		System.out.println("Lowercase: " + lCount);
	}
}