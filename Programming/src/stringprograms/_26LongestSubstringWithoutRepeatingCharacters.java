package stringprograms;

public class _26LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abcabcbb";

		int maxLen = 0;

		for (int i = 0; i < s.length(); i++) {

		    String temp = "";

		    for (int j = i; j < s.length(); j++) {

		        char ch = s.charAt(j);

		        if (temp.indexOf(ch) != -1) {
		            break;
		        }

		        temp += ch;

		        if (temp.length() > maxLen) {
		            maxLen = temp.length();
		        }
		    }
		}

		System.out.println(maxLen);
	}
}
