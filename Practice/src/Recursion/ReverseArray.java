package Recursion;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,3,22,1,2,23};
		int start = 0;
		int end = arr.length-1;
		reverseArray(arr,start,end);
		System.out.println(Arrays.toString(arr));
		
		
	}
	public static void reverseArray(int[] arr,int start,int end) {
		
		if(start>=end) {
			return;
		}
		int temp = arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
		reverseArray(arr,start+1,end-1);
		
		
	}
	

}
