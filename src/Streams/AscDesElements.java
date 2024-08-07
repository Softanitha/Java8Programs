package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscDesElements {
	public static void main(String[] args) {
		
		List<Integer>elements=Arrays.asList(4,9,2,10,8,6);
		
//		Set<Integer> unique = elements.stream().collect(Collectors.toSet());
//		System.out.println("Unique values are :"+unique);
		
		List<Integer>asc=elements.stream().sorted((x1,x2)->x1-x2).collect(Collectors.toList());
		System.out.println("ascding order is:  "+asc);
		
		List<Integer>des=elements.stream().sorted((x1,x2)->x2-x1).collect(Collectors.toList());
		System.out.println("descending order :"+des);
	}
}
