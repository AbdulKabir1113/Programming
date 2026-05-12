package stringprograms;

public class _19FindLargestWordString {

	public static void main(String[] args) {
		String s = "new programming";
		String [] str = s.split(" ");
		String largest = "";
		

		for(int i = 0; i < str.length; i++) {

		    if(str[i].length() > largest.length()) {
		        largest = str[i];
		    }
		}
		System.out.println(largest);
		
		}
	
}
