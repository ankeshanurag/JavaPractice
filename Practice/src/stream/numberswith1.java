package stream;

import java.util.List;
import java.util.stream.Collectors;

public class numberswith1 {

	public static void main(String[] args) {
		// Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		
		List<Integer> list = List.of(7,11,3,1,15,27,88,47,11,18,15);
		List<String> res = list.stream().map(e-> e+ "").filter(e->e.startsWith("1")).collect(Collectors.toList());
		System.out.println("result list is " + res );

	}

}
