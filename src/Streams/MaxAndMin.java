package Streams;

import java.util.ArrayList;
import java.util.List;

class Product2  {
	int id;
	String name;
	float price;
	public Product2(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

public class MaxAndMin {

	public static void main(String[] args) {

		List<Product2>productList=new ArrayList<>();
		productList.add(new Product2(1,"xyz latop",24000f));
		productList.add(new Product2(2,"abc latop",10000f));
		productList.add(new Product2(3,"pqr latop",50000f));
		productList.add(new Product2(4,"rst latop",30000f));
		
	Product2 productA =productList.stream().max((product1,product2)->product1.price>product2.price ? 1 :-1).get();
System.out.println("max price: "+productA.price);

Product2 productB = productList.stream().min((product,product1)->product.price>product1.price ? 1 :-1).get();
System.out.println("max price: "+productB.price);
	
	}

}
