package stringProcessing;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "geeksforgeeks", "geeks", "geek", "geezer" };
		longestCommonPrefix(arr);

	}
	public static String longestCommonPrefix(String[] arr) {
		Arrays.sort(arr);
		String first = arr[0];
		String last = arr[arr.length-1];
		int smallestStringLength = Math.min(first.length(), last.length());
		System.out.println("smallest length is " + smallestStringLength);
		int i =0;
		while()
		return "";
	}

}
