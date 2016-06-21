<<<<<<< HEAD
public class Product {
	private String name;
	private String category;
	private double price;
	private String description;
	
	public Product(String name, String category, String price, String description){
		this.name = name;
		this.category = category;
		this.price = Double.parseDouble(price);
		this.description = description;
	}

	public Product(String name, String category, String price){
		this.name = name;
		this.category = category;
		this.price = Double.parseDouble(price);
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

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return name + "(" + category + ") $" + price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
=======

public class Product {

	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}

}
>>>>>>> 7489c3751ed09e6c3c052bb22c50d040dbde8c57
