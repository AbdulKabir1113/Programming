package stringprograms;

public class _23RemoveDuplicatesMaintainingOrder {

	public static void main(String[] args) {

		String s = "banana";

		StringBuilder res = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			boolean found = false;

			for (int j = 0; j < i; j++) {

				if (s.charAt(j) == ch) {
					found = true;
					break;
				}
			}

			if (!found) {
				res.append(ch);
			}
		}

		System.out.println(res);
	}
}