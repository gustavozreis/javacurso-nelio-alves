package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat oMomFormat= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //order moment date format
	private static SimpleDateFormat cBDateFormat = new SimpleDateFormat("dd/MM/yyyy"); //client birth date format	
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	//constructors
	public Order() {
		
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	//getters and setters
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	
	//methods
	
	//add item to list
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	//remove item from list
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	//get total order price
	public double total() {
		double totalSum = 0.0;
		for (OrderItem item : items) {
			totalSum += item.subTotal();
		}
		return totalSum;
	}
	
	//toString ORDER SUMMARY
	@Override
	public String toString() {
		StringBuilder sBuild = new StringBuilder();
		sBuild.append("ORDER SUMMARY: \n");
		sBuild.append("Order moment: " + oMomFormat.format(moment) + "\n");
		sBuild.append("Order status: " + getStatus() + "\n");
		sBuild.append("Client: " 
					+ client.getUsername() 
					+ " (" + cBDateFormat.format(client.getBirthDate()) + ") - " 
					+ client.getEmail() 
					+ "\n");
		sBuild.append("Order items:\n");
		for (OrderItem item : items) {
			sBuild.append(item.getProduct().getName() 
					+ ", $" + item.getPrice() 
					+ ", Quantity: " + item.getQuantity()
					+ ", Subtotal: $" + item.subTotal() 
					+ "\n");			
		}
		sBuild.append("Total price: $" + total());	
		
		return sBuild.toString();
	}
	
}
