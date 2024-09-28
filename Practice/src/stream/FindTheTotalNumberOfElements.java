package stream;

import java.util.List;

public class FindTheTotalNumberOfElements {

	public static void main(String[] args) {
		// 5. Given a list of integers, find the total number of elements present in the list using Stream functions?
		
		List<Integer> list = List.of(77,11,3,1,15,27,88,47,11,18,15,66);
		long count = list.stream().count();
		System.out.print(count);

	}

}
