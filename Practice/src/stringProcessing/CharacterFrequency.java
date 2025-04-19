package stringProcessing;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "banana";
		 frequency(str);

	}
	public static void frequency(String str) {
		//using streams
		Map<Character,Long> res = str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(e->e,Collectors.counting()));
		System.out.println("count of elements are" + res);
		
		//with map
		HashMap<Character,Integer> mp= new HashMap<>();
		for(char c:  str.toCharArray()) {
			if(mp.containsKey(c)) {
				mp.put(c,mp.get(c)+1);
			}
			else {
				mp.put(c,1);
			}
		}
		System.out.println("the count of the elements" + mp);
		
		
	}
 
}
