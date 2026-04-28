package arrayprograms;

public class _30LongestSubarraywithEqual0sand1s {

	public static void main(String[] args) {
		int [] a = {0,1,0,1,1,0};
		
		int maxLen = 0;
		for(int i=0; i<a.length; i++) {
			int len=0;
			int count0=0;
			int count1=0;
			for(int j=i; j<a.length; j++) {
				if(a[j]==0) {
					count0++;
				}else if(a[j]==1) {
					count1++;
				}
				
				if(count0==count1) {
					len=j-i+1;
					if(len>maxLen) {
						maxLen=len;
					}
				}
			}
			
		}
		System.out.println(maxLen);
	}
}
