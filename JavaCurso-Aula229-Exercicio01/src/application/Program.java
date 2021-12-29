package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		// instantiate input scanner and set locale input
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// instantiate employees list
		List<Employee> employeesList = new ArrayList<>();
		
		// ask for file path input
		System.out.print("Enter full file path: ");
		String filePath = sc.nextLine();
		
		// instantiate file reader
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			
			// read file, separate lines, add to employees list
			String line = br.readLine();
			while (line != null) {				
				String[] fields = line.split(",");
				employeesList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}			
			
		} catch (IOException exc) {
			System.out.println(exc.getMessage());
		}
		
		// ask for salary cap input
		System.out.print("Enter salary: ");
		Double salCap = sc.nextDouble();
		
		// instantiate comparator
		Comparator<String> comp = (name1, name2) -> name1.toUpperCase().compareTo(name2.toUpperCase());
		
		// reorganize list following salary input
		List<String> richEmployees = employeesList.stream()
								.filter(emp -> emp.getSalary() > salCap)
								.map(emp -> emp.getEmail()).sorted(comp)
								.collect(Collectors.toList());
		
		// reorganize list with sum of salary of people whose name starts with 'M' and sum them
		Double mAvSal = employeesList.stream()
						.filter(emp -> emp.getName().charAt(0) == 'M')
						.map(sal -> sal.getSalary())
						.reduce(0.0, (sal1, sal2) -> sal1 + sal2);
		
		// output sorted employees emails from list
		System.out.println("Email of people whose salary is more than " + salCap + ":");
		richEmployees.forEach(System.out::println);
		
		
		// output result of asumof salaries from employees whose name starts with 'M'
		System.out.print("Sum of salary of people whose name starts with 'M': " + mAvSal);
		
		sc.close();
	}

}
