package stringprograms;

public class _16ReplaceSpaceswith20 {

	public static void main(String[] args) {
		String s = "Hello World";
		StringBuilder res = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)!=' ')
				res.append(s.charAt(i));
			else
				res.append("%20");
		}
		
		System.out.println(res);
	}
}
