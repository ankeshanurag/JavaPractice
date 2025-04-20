package stringProcessing;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog";
		String str1 = str.toLowerCase();
		
		System.out.println("longestword is " + longestWord(str1));

	}
	
	public static String longestWord(String str){
		String[] words = str.split(" ");
		String longestword = "";
		for(String word: words) {	
			if (word.length() > longestword.length()) {
				longestword = word;
	        }
			
		}
		return longestword;
	}

}
