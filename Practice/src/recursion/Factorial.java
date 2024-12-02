package recursion;

import java.util.Arrays;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 4;
		int res = factorial(val);
		System.out.println(res);
		
		
	}
	public static int factorial(int val) {
		
		if(val<=1) {
			return 1;
		}
		val = val*factorial(val-1);
		return val;
	}
}
