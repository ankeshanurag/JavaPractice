package stringProcessing;

public class RotationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "cdab";
		int n = s1.length();
		String rotatedWord="";
		for(int i =0;i<n;i++) {
			char last = s1.charAt(n-1);
			System.out.print("last is" + last);
			 rotatedWord = last+s1.substring(0,n-2);
			if(rotatedWord.equals(s2)) {
				System.out.print("String is rotation");
			}
		}System.out.println("not rotation");

	}

}
