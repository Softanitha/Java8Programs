package FunctionInterface;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
   Predicate<Integer>pr=a->(a>18);
   System.out.println(pr.test(10));//result boolean true or false
	}

}
