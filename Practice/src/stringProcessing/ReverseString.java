package stringProcessing;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		int n = str.length();
		//int i=0;
		String result="";
		
		//method 1: using stack
		
		Stack<Character> st = new Stack<>();
		for(int i =0;i<n;i++) {
			st.push(str.charAt(i));
		}
		while(!st.isEmpty()) {
			result = result+st.pop();
			System.out.println("result is "+ result);
		}
		System.out.println("final result is "+ result);
		if(str.equalsIgnoreCase(result)) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	
		
		
		//method 2: using two pointer (using temp variable)
		
		String strs = "anurag";
		char[] ch = strs.toCharArray();
		int m = strs.length();
		int start =0;
		int end = m-1;
		char temp;
		while(start<end) {
			temp=ch[start];
			ch[start]= ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		System.out.println("reversed string is " + String.valueOf(ch));

	}

}
