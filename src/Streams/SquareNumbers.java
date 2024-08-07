package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SquareNumbers {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(2, 4, 5, 6, 7, 8, 9);
		System.out.println("square the given numbers");
		integers.stream().mapToInt(n -> n * n).forEach(System.out::println);
//		 System.out.println("greather than or equal to 100 ");
//		 integers.stream().mapToInt(n->n*n).filter(n->n>=100).forEach(System.out::println);
		OptionalDouble opt = integers.stream().mapToInt(n -> n * n).filter(n -> n >= 100).average();
		if (opt.isPresent()) {
			System.out.println("average of given number is:" + opt.getAsDouble());
		} else {
			System.out.println("numbers not found");
		}
	}
}
