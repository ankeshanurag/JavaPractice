package stream;

import java.util.List;

public class FindMaxElement {

	public static void main(String[] args) {
		// 6. Given a list of integers, find the maximum value element present in it using Stream functions?
		
		List<Integer> list = List.of(77,11,3,1,15,27,88,47,11,18,15,66);
		long max = list.stream().max(Integer::compare).get();
		System.out.print(max);

	}

}
