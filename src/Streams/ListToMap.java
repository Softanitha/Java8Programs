package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product4{
	int id;
	String name;
	float price;
	public Product4(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class ListToMap {

	public static void main(String[] args) {

		List<Product4>productList=new ArrayList<>();
		productList.add(new Product4(1,"HP latop",25000f));
		productList.add(new Product4(2,"Del latop",30000f));
		productList.add(new Product4(3,"Lenovo latop",40000f));
		productList.add(new Product4(4,"Apple latop",13000f));
		
		Map<String, Float> productPriceMap=productList.stream().collect(Collectors.toMap(p->p.name, p->p.price));
		
		System.out.println(productPriceMap);
	}

}
