package entities;

public class Product {
	
	String name;
	double price;
	int quantity;
	
	// constructor
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// getters and setters

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}	
	
	// methods
	
	// calculates total price
	public Double totalPrice() {
		return getQuantity() * getPrice();
	}
	
	// toString overrided
	@Override
	public String toString() {
		return getName() + "," + String.format("%.2f", totalPrice());
	}

}
