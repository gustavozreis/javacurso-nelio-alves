package entities;

public class Product {
	
	private String name;
	private Double price;
	
	// constructors
	
	public Product(){
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	// m�todo para imprimir price tag
	public String priceTag() {
		return this.getName() + " $ " + String.format("%.2f", this.getPrice());
	}

}



