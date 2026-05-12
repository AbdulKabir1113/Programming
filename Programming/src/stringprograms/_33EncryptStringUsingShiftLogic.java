package stringprograms;

public class _33EncryptStringUsingShiftLogic {

	public static void main(String[] args) {

		String s = "xyz";

		StringBuilder res = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z') {

				if (ch + i > 'z')
					res.append((char) (ch + i - 26));
				else
					res.append((char) (ch + i));
			}

			else {
				res.append(ch);
			}
		}

		System.out.println(res);
	}
}