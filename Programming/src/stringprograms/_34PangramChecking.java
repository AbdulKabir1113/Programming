package stringprograms;

public class _34PangramChecking {

		public static void main(String[] args) {

			String s = "The quick brown fox jumps over the lazy dog";

			s = s.toLowerCase();

			boolean[] arr = new boolean[26];

			for (int i = 0; i < s.length(); i++) {

				char ch = s.charAt(i);

				if (ch >= 'a' && ch <= 'z') {

					arr[ch - 'a'] = true;
				}
			}

			boolean flag = true;

			for (int i = 0; i < arr.length; i++) {

				if (!arr[i]) {
					flag = false;
					break;
				}
			}

			if (flag)
				System.out.println("PANGRAM");
			else
				System.out.println("NOT PANGRAM");
		}
}


//package stringprograms;
//
//public class _34PangramChecking {
//
//	public static void main(String[] args) {
//
//		String s = "The quick brown fox jumps over the lazy dog";
//
//		s = s.toLowerCase();
//
//		char[] arr = new char[26];
//
//		for (int i = 0; i < s.length(); i++) {
//
//			char ch = s.charAt(i);
//
//			if (ch >= 'a' && ch <= 'z') {
//
//				arr[ch - 'a'] = ch;
//			}
//		}
//
//		boolean flag = true;
//
//		char ch = 'a';
//
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] != ch) {
//				flag = false;
//				break;
//			}
//
//			ch++;
//		}
//
//		if (flag)
//			System.out.println("PANGRAM");
//		else
//			System.out.println("NOT PANGRAM");
//	}
//}