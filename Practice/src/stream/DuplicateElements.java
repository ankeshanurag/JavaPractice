package stream;

import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		// How to find duplicate elements in a given integers list in java using Stream functions?
		
		List<Integer> list = List.of(7,11,3,1,15,27,88,47,11,18,15);
		List<Integer> res = list.stream().distinct().collect(Collectors.toList());
		System.out.println("result list is " + res );

	}

}
