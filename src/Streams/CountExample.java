package Streams;

import java.util.ArrayList;
import java.util.List;

class Product3  {
	int id;
	String name;
	float price;
	public Product3(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class CountExample {

	public static void main(String[] args) {
		List<Product3>productList=new ArrayList<>();
		productList.add(new Product3(1,"xyz latop",24000f));
		productList.add(new Product3(2,"abc latop",10000f));
		productList.add(new Product3(3,"pqr latop",50000f));
		productList.add(new Product3(4,"rst latop",30000f));
		
		long count=productList.stream().filter(product->product.price>=10000).count();
		System.out.println("Number of productes >10000 are :"+count);
	}

}
