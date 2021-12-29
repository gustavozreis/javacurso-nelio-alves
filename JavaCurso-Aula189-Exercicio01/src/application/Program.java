package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		// initiate input scanner
		Scanner sc = new Scanner(System.in);
		
		// ask for path direction
		System.out.println("Enter file path:");
		String filePath = sc.nextLine();
		
		// create product list
		List<Product> prodList = new ArrayList<>();
		
		// start bufferedReader for designated file
		try (BufferedReader file01 = new BufferedReader(new FileReader(filePath))) {
			
			// split lines, create a Product() object for each line, add object to list
			String line = file01.readLine();
			while (line != null) {
				String[] splitedLine = line.split(",");				
				Product item = new Product(splitedLine[0], Double.parseDouble(splitedLine[1]), Integer.parseInt(splitedLine[2]));
				
				prodList.add(item);
				
				line = file01.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		// get used file directory create new folder and file name
		File mainFile = new File(filePath);
		String mainFileDirectory = mainFile.getParent();
		
		boolean success = new File(mainFileDirectory + "\\out").mkdir();
		
		String newFileOutputName = mainFileDirectory + "\\out\\summary.csv";		
		
		// instantiate bufferedWriter
		try (BufferedWriter outputFile = new BufferedWriter(new FileWriter(newFileOutputName))){
			
			for (Product product : prodList) {
				outputFile.write(product.toString());
				outputFile.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
