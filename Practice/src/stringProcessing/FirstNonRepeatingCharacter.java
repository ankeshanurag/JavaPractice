package stringProcessing;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "abacabba";
		System.out.println(nonRep(name));
		
		

	}
	
	public static char nonRep(String name) {
		char nonRepeating;
		for(int i =0;i<name.length();i++) {
			boolean visited =false;
			for(int j=0;j<name.length();j++) {
				if(i!=j &&name.charAt(i)==name.charAt(j)) {
					visited = true;
					break;
				}
				
			}
			if(!visited) {
				return name.charAt(i);
			}
		}
		return '$';
	}

}
