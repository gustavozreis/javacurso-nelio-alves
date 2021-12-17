import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//input employee data
		System.out.print("Name:");
		String employeeName = sc.nextLine();
		System.out.print("Gross salary:");
		double employeeGrossSalary = sc.nextDouble();
		System.out.print("Tax:");
		double employeeTax = sc.nextDouble();
		
		//instantiate object
		Employee joaoSilva = new Employee(employeeName, employeeGrossSalary, employeeTax);
		
		//print employee data
		joaoSilva.employeeData();
		
		//ask for salary increase in percentage
		System.out.print("Which percentage to increase salary? ");
		double percentageIncrease = sc.nextDouble();

		joaoSilva.increaseSalary(percentageIncrease);
				
		
		sc.close();	
		
	}

}
