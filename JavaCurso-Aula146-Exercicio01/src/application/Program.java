package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawExceptions;

public class Program {

	public static void main(String[] args) {
		
		// input format and input scanner 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// ask for account data input
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		Integer accNumber = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String accHolder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double accBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double accWithdrawLimit = sc.nextDouble();
		System.out.println();
		
		// instantiate Account() object		
		Account acc01 = new Account(accNumber, accHolder, accBalance, accWithdrawLimit);
		
		// ask for withdraw amount input
		try {
			System.out.print("Enter amount for withdraw: ");
			Double wdAmount = sc.nextDouble();
			acc01.withdraw(wdAmount);
			System.out.print("New balance:" + acc01.getBalance());
			}
		
		catch (WithdrawExceptions e){
			System.out.println("Withdraw error: " + e.getMessage());
			}
		
		sc.close();

	}

}
