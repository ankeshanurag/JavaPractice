package recursion;

public class PalindromeRecursion {

	public static void main(String[] args) {
		String str = "naman";
		int len = str.length();
		boolean res = palindrome(str, 0, len-1);
		System.out.println(res);
		
		
	}
	public static boolean palindrome(String str,int start,int end) {
		
		if(start==end) {
			return true;
		}
		
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		
		if(start<end+1) {
			return palindrome(str,start+1,end-1);
		}
			return true;	
		
		
	}

}
