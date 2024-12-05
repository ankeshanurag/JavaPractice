package recursion;

public class FibonacciRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		fibo(n,0,1);
//		System.out.println();

	}
	
public static void fibo(int n,int first , int second) {
		
	if(n>=0) {
		System.out.print(first + " ");
		 fibo(n-1,second,first+second);
	}
	}

}
