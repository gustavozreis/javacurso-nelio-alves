package application;

import java.util.Date;

import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		
		Date date = new Date("15/03/2017");
		Product tablet = new UsedProduct("Notebook", 1100.00, date);
		System.out.println(tablet.priceTag());

	}

}
