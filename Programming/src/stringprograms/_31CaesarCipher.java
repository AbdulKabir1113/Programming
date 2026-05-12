package stringprograms;

public class _31CaesarCipher {

	// Uppercase — same result, one line
//	res.append((char) ('A' + (ch - 'A' + shift) % 26));

	// Lowercase — same result, one line  
//	res.append((char) ('a' + (ch - 'a' + shift) % 26));
	
	public static void main(String[] args) {

		String s = "TCS 2026";
		int shift = 5;

		StringBuilder res = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			// Uppercase letters
			if (ch >= 'A' && ch <= 'Z') {

				if (ch + shift > 'Z')
					res.append((char) (ch + shift - 26));
				else
					res.append((char) (ch + shift));
			}

			// Lowercase letters
			else if (ch >= 'a' && ch <= 'z') {

				if (ch + shift > 'z')
					res.append((char) (ch + shift - 26));
				else
					res.append((char) (ch + shift));
			}

			
			else {
				res.append(ch);
			}
		}

		System.out.println(res);
	}
}