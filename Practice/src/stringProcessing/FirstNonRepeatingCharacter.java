package stringProcessing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "madam";
		char res = nonRep(name);
		System.out.println("first non repeating char is "+res);
		
		

	}
	
	public static Character nonRep(String name) {
		LinkedHashMap<Character,Integer> mp = new LinkedHashMap<>();
		char[] ch = name.toCharArray();
		for(char c:ch) {
			if(mp.containsKey(c)){
				mp.put(c,mp.get(c)+1);
				
			}else {
				mp.put(c,1);
			}
		
		}
		for(Map.Entry<Character,Integer> entry : mp.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}return '$';
	}

}
