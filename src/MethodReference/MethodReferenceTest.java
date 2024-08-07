package MethodReference;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest {

	public static void main(String[] args) {
     List<String>list=new ArrayList<>();
     list.add("anitha");
     list.add("yagna");
     list.add("Raghu");
     list.forEach(System.out::println);//:: this operator is a method reference
	}

}
