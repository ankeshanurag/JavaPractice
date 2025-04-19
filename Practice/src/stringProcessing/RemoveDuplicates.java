package stringProcessing;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		removeDuplicatesFromString(str);

	}
	public static void removeDuplicatesFromString(String str) {
		char[] ch = str.toCharArray();
		LinkedHashSet<Character> st = new LinkedHashSet<>();
		for(char c: ch) {
			st.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c:st) {
			sb.append(c);
		}
		
		System.out.println("new string is " + sb);
	}

}
