package stringprograms;

public class _17CountSubstringOccurrences {
 
		public static void main(String[] args) {

			String s = "aaaa";
			String p = "aa";

			int count = 0;

			for (int i = 0; i <= s.length() - p.length(); i++) {

				boolean match = true;

				for (int j = 0; j < p.length(); j++) {

					if (s.charAt(i + j) != p.charAt(j)) {
						match = false;
						break;
					}
				}

				if (match) {
					count++;
				}
			}

			System.out.println(count);
		}
	
}
