package stream;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		// 1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
		
		List<Integer> list = List.of(7,11,3,1,15,27,88,47,11,18,15);
		List<Integer> res = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("result list is " + res );
	}

}
