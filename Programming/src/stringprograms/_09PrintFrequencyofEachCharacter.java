package stringprograms;

public class _09PrintFrequencyofEachCharacter {

	public static void main(String[] args) {
		String s = "programming";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') // ✅ Skip already counted chars
				continue;

			char ch = s.charAt(i); // ✅ Save original char before s changes
			int count = 1;

			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(j) == ch) {
					count++;
				}
			}

			s = s.replace(ch, '0'); // ✅ Replace AFTER counting, not during
			System.out.println(ch + "->" + count);
		}
	}
}
