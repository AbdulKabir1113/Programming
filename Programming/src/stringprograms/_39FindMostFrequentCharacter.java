package stringprograms;

public class _39FindMostFrequentCharacter {

	public static void main(String[] args) {

		String s = "programming";

		int freq = 0;
		char fC = ' ';

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			boolean alreadyCounted = false;

			
			for (int k = 0; k < i; k++) {

				if (s.charAt(k) == ch) {
					alreadyCounted = true;
					break;
				}
			}

			if (alreadyCounted)
				continue;

			int count = 0;

			
			for (int j = 0; j < s.length(); j++) {

				if (ch == s.charAt(j))
					count++;
			}

			if (count > freq) {

				freq = count;
				fC = ch;
			}
		}

		System.out.println(fC + " -> " + freq);
	}
}