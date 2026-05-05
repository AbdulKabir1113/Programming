package stringprograms;

public class _06ConvertUppercasetoLowercase {

	public static void main(String[] args) {
		String s = "HELLO JAVA";
		StringBuilder s1 = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			
//			if(s.charAt(i) >= 65 && s.charAt(i) <=90)
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')	
				s1.append((char)(s.charAt(i)+ 32));
			else 
				s1.append(s.charAt(i));
		}
		
		System.out.println(s1);
	}
}
