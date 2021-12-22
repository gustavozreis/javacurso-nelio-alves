package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		//set input locale and initiate input scanner
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//client birth date format	
		SimpleDateFormat bDateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
		
		//input client data
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String username = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");		
		Date birthDate = bDateFormat.parse(sc.nextLine());
		System.out.println();
		
		//enter order data
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		Integer orderItems = sc.nextInt();
		
		//instantiate date when order was created
		Date moment = new Date();
		
		//instantiate order object
		Order order = new Order(moment, OrderStatus.valueOf(status), new Client(username, email, birthDate));
		
		//insert items on order
		for (int i=0; i<orderItems; i++) {
			sc.nextLine();
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: "); //product name
			String name = sc.nextLine();
			System.out.print("Product price: "); //product price
			double price = sc.nextDouble();
			System.out.print("Quantity: "); //product quantity
			Integer quantity = sc.nextInt();
			
			//instantiate OrderItem with Product and add it to the OrderItem list
			order.addItem(new OrderItem(quantity, price, new Product(name, price)));				
		}
		
		System.out.println();
		
		//print ORDER SUMMARY
		System.out.println(order.toString());
		
		
		sc.close();	


	}

}
