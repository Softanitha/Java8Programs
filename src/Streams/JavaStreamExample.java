package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

public class JavaStreamExample {

	public static void main(String[] args) {
		List<Product>productList=new ArrayList<>();
		productList.add(new Product(1,"HP latop",25000f));
		productList.add(new Product(2,"Del latop",30000f));
		productList.add(new Product(3,"Lenovo latop",40000f));
		productList.add(new Product(4,"Apple latop",13000f));
		List<String>productPriceList=productList.stream().filter(p->p.price>=10000)
				.map(p->p.name).collect(Collectors.toList());
		System.out.println(productPriceList);

	}

}
