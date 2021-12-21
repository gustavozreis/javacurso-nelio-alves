package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	Product product;;

	//construtctors
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	//getter and setters
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}
	
	//method to return order price total
	public Double subTotal() {
		return quantity * price;
	}
	
	
}

	