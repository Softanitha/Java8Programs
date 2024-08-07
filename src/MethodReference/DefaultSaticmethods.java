package MethodReference;


interface HelloGreeting{
	
	default void greet() {
		System.out.println("Hello,this is default method");
	}
	
	void greetAgain(String str);
	
	static void hi(String msg) {
		System.out.println(msg);
	}
}


public class DefaultSaticmethods implements HelloGreeting {
	
	public void greetAgain(String str) {
		System.out.println(str);
	}
	 public static void main(String[] args) {
		 
		 DefaultSaticmethods ds=new DefaultSaticmethods();
		 ds.greet();
		 ds.greetAgain("work is worships");
		 HelloGreeting.hi("anitha");
	}


	}


