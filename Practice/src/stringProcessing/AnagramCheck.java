package stringProcessing;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
		String str2 = "silent";
		
		System.out.println("this is " + anagram(str1,str2));

	}
	
	public static boolean anagram(String str1,String str2){
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(String.valueOf(ch1).equalsIgnoreCase(String.valueOf(ch2))) {
			return true;
		}
		return false;
	}

}
