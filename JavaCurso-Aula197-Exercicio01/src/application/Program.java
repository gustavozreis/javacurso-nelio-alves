package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.InstallmentCalculator;
import services.PayPal;

public class Program {

	public static void main(String[] args) throws ParseException {

		// setting locale input and initialize input scanner
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// instantiate simple date formate for used dates
		SimpleDateFormat dates = new SimpleDateFormat("dd/MM/yyyy");
		
		// ask for contract data input
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer contNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date contDate = dates.parse(sc.nextLine());
		System.out.print("Contract value: ");
		Double contValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		Integer contInst = sc.nextInt();
		
		// instantiate Contract() object
		Contract contract01 = new Contract(contNumber, contDate, contValue, new Installment(contDate, contValue));
		
		// output data
		System.out.println("Installments:");
		InstallmentCalculator pServ01 = new InstallmentCalculator(contDate, contValue, contInst, new PayPal());
		pServ01.calculateInstallment();
		
		sc.close();

	}

}
