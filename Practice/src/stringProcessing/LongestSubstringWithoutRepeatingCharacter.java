package stringProcessing;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {

	public static void main(String[] args) {
String str = "abcabcbb";
		
		int len = str.length();
		int sizeOfSubstring = 0;
		int newSize =0;
		for(int i=0;i<len;i++) {
			String longestString = "";
			for(int j=i;j<len;j++) {
				if(longestString.contains(String.valueOf(str.charAt(j)))) {
					newSize=longestString.length();		
					break;
				}
				longestString = longestString + str.charAt(j);
				System.out.println("longestString is " + longestString);
				
			}
		}if(newSize > sizeOfSubstring) {
			sizeOfSubstring = newSize;
		}
		System.out.println("sizeOfSubstring is " + sizeOfSubstring);
		
	}
}
