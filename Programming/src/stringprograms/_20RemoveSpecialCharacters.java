package stringprograms;

public class _20RemoveSpecialCharacters {

	public static void main(String[] args) {
		String s = "Hello@World#2026!";
		StringBuilder res = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <='Z' || ch>='a' && ch<='z' || ch >= '0' && ch<='9') {
				res.append(ch);
			}
		}
		System.out.println(res);
	}
}
