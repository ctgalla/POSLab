import java.util.ArrayList;
import java.util.Scanner;


public class Product {
	protected static String name;
	protected static String category;
	protected static double price;
	protected static String description;
	
	public Product(String name, String category, String price, String description){
		Product.name = name;
		Product.category = category;
		Product.price = Double.parseDouble(price);
		Product.description = description;
	}

	public Product(String name, String category, double price){
		Product.name = name;
		Product.category = category;
		Product.price = (price);
	}
	
	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}
	
	public String getDescription() {
		return description;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setCategory(String category) {
//		this.category = category;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
	
	public String toString() {
		return name + "(" + category + ") $" + price;
	}
	
	
//	public void setDescription(String description) {
//		this.description = description;
//	}

}
