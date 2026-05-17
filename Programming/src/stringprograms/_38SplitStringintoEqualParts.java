package stringprograms;

public class _38SplitStringintoEqualParts {



		public static void main(String[] args) {

			String s = "abcdefgh";
			int k = 4;

			if (s.length() % k != 0) {

				System.out.println("NOT POSSIBLE");
				return;
			}

			int size = s.length() / k;

			for (int i = 0; i < s.length(); i += size) {

				for (int j = i; j < i + size; j++) {

					System.out.print(s.charAt(j));
				}

				System.out.println();
			}
		}
	
}
