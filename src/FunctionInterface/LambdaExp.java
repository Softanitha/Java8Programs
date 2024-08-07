package FunctionInterface;

interface Hi{
	public String greet(String name);
}
public class LambdaExp {

	public static void main(String[] args) {
		
		Hi h1=(name)->{
			return "Hi "+name;
		};
		System.out.println(h1.greet("anitha"));
		
		Hi h2=name->{
			return "Welcome "+name;
			
		};
		System.out.println(h2.greet("Raghu"));

	}

}
