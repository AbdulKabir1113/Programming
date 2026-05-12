package stringprograms;

public class _21CheckAnagram {

	public static void main(String[] args) {

		String s1 = "silent";
		String s2 = "listen";

		if (s1.length() != s2.length()) {
			System.out.println("Not Anagram");
			return;
		}

		for (int i = 0; i < s1.length(); i++) {

			char ch = s1.charAt(i);

			int count1 = 0;
			int count2 = 0;

			for (int j = 0; j < s1.length(); j++) {

				if (s1.charAt(j) == ch)
					count1++;

				if (s2.charAt(j) == ch)
					count2++;
			}

			if (count1 != count2) {
				System.out.println("Not Anagram");
				return;
			}
		}

		System.out.println("Anagram");
	}
}