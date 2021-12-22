package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		// inicializar input teclado e formatar para decimal com ponto
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// instanciar classe SimpleDateFormat para converter string para date() 
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");	
		
		// pedir input de número de produtos a ser inserido
		System.out.print("Enter the number of products: ");
		int prodNumber = sc.nextInt();
		
		// instanciar lista de produtos
		List<Product> prodList = new ArrayList<>();
				
		// pedir input de cada produto e inserir na lista
		for (int i=0; i<prodNumber; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			
			System.out.print("Common, user or imported (c/u/i)? ");
			char prodType = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String prodName = sc.nextLine();
			
			System.out.print("Price: ");
			Double prodPrice = sc.nextDouble();
			
			if (prodType == 'i') {
				System.out.print("Customs fee: ");
				Double custFee = sc.nextDouble();
				prodList.add(new ImportedProduct(prodName, prodPrice, custFee));
			} 
			else if (prodType == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				Date prodManDate = dateFormat.parse(sc.nextLine());
				prodList.add(new UsedProduct(prodName, prodPrice, prodManDate));
			} 
			else {
				prodList.add(new Product(prodName, prodPrice));
			}			
			
			}		
		
		// imprimir PRICE TAGS com dados dos produtos
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product products : prodList) {
			System.out.println(products.priceTag());
		}
		
		sc.close();

	}

}
