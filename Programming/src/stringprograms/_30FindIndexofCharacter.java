package stringprograms;

public class _30FindIndexofCharacter {

	public static void main(String[] args) {
		String s = "programming";
	    char c = '0';
	    boolean flag = false;
//	    System.out.println(s.indexOf(c));
	    
	    
	    for(int i=0; i<s.length(); i++) {
	    	
	    	if(s.charAt(i) == c) {
	    		System.out.println(i);
	    		flag = true;
	    		break;
	    	}
	    }
	    if(!flag) {
	    	System.out.println(-1);
	    }
	}
}
