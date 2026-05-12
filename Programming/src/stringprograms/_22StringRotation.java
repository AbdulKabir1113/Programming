package stringprograms;

public class _22StringRotation {

		public static void main(String[] args) {

			String s1 = "abcde";
			String s2 = "cdeab";

			if (s1.length() != s2.length()) {
				System.out.println("NO");
				return;
			}

			String temp = s1 + s1;

			if (temp.contains(s2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
}
