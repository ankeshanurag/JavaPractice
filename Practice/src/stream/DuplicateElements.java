package stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		// 3. How to find duplicate elements in a given integers list in java using Stream functions?
		
		List<Integer> list = List.of(7,11,3,1,15,27,88,47,11,18,15);
		Set<Integer> duplicate = list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
		.entrySet().stream()
		.filter(entry->entry.getValue()>1)
		.map(entry->entry.getKey()).collect(Collectors.toSet());
		System.out.println("dplicate elements are " + duplicate);
		
		
		
		
		//Find all distinct value in list.
		
		List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct elements are" + distinct );

	}

}
