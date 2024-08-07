package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcateNumbers {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 10, 3, 4, 5, 6);
		List<Integer> list2 = Arrays.asList(4, 2, 3, 9, 8, 1,5);
		Stream<Integer> elements = Stream.concat(list1.stream(), list2.stream());
		List<Integer> allElements = elements.collect(Collectors.toList());
		System.out.println(allElements);

		Set<Integer> unique = allElements.stream().collect(Collectors.toSet());
		System.out.println("unique elements" + unique);
		Integer min = unique.stream().min((x1, x2) -> x1 - x2).get();
		System.out.println("minimum value is: " + min);
		Integer max = unique.stream().max((x1, x2) -> x1 - x2).get();
		System.out.println("minimum value is: " + max);
		
		

	}

}
