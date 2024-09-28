package stream;

import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {
		// Given the list of integers, find the first element of the list using Stream functions?
		
		List<Integer> list = List.of(77,11,3,1,15,27,88,47,11,18,15);
		 list.stream().findFirst().ifPresent(System.out::println);
	}

}
