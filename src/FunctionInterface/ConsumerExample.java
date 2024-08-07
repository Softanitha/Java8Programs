package FunctionInterface;

import java.util.function.Consumer;

public class ConsumerExample {
	static void printMessage(String name) {
		System.out.println(name +" This is printMesage");
		
	}
	static void printValue(int value) {
		System.out.println("value is: "+value);
	}
	
	public static void main(String[] args) {
		
		Consumer<String>c1=ConsumerExample::printMessage;
		c1.accept("anitha");
		Consumer<Integer>c2=ConsumerExample::printValue;
		c2.accept(10);
		
	}

}
