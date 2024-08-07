package FunctionInterface;

import java.util.function.Function;

public class FunctionInterfaceExample {
	
	static String display(String message) {
		return "hello "+message;
     
	}
	public static void main(String[] args) {
		Function<String, String> fun=FunctionInterfaceExample::display;
		System.out.println(fun.apply("function"));
	}

}
