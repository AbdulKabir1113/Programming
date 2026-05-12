package stringprograms;

public class _27CheckifStringContainsOnlyDigits {

	public static void main(String[] args) {

		String s = "12345";

		boolean flag = true;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (!(ch >= '0' && ch <= '9')) {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}