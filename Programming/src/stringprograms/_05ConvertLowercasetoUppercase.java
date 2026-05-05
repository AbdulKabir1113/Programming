package stringprograms;

public class _05ConvertLowercasetoUppercase {

	public static void main(String[] args) {
//		String s = "hello world";
//		s = s.toUpperCase();
//		System.out.println(s);

		String s = "hello world";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z')
				result.append((char) (ch - 32)); // ✅ ASCII trick
			else
				result.append(ch); // space, digits unchanged
		}

		System.out.println(result.toString());
	}
}
