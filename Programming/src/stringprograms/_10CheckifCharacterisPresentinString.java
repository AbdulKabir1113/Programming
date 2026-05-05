package stringprograms;

public class _10CheckifCharacterisPresentinString {

	public static void main(String[] args) {
		String s = "programming";
		char c = 'g';
		boolean found = false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) { 
				found = true;
				break; 
			}
		}

		if (found)
			System.out.println("FOUND");
		else
			System.out.println("NOT FOUND");
	}
}