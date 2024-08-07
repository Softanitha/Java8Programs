package Streams;

import java.util.ArrayList;
import java.util.List;

class Product1{
	int id;
	String name;
	float price;
	public Product1(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

public class forEachExample {

	public static void main(String[] args) {

		List<Product1>productList=new ArrayList<>();
		productList.add(new Product1(1,"HP latop",25000f));
		productList.add(new Product1(2,"Del latop",30000f));
		productList.add(new Product1(3,"Lenovo latop",40000f));
		productList.add(new Product1(4,"Apple latop",13000f));
		
		productList.stream().filter(product->product.price==30000)
		           .forEach(product->System.out.println(product.name));
		

	}

}