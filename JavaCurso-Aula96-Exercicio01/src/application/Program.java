package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entitites.Employee;

public class Program {

	public static void main(String[] args) {
		
		//idioma input e scanner
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//input quantos funcionarios serao registrados
		System.out.print("How many employees will be registered? ");
		int eReg = sc.nextInt();
		sc.nextLine();
		
		//criacao lista de funcionarios
		List<Employee> regEmployees = new ArrayList<>();
		
		//loop de input de dados dos funcionarios a serem registrados
		for (int i=0; i<eReg; i++) {
			
			System.out.print("Enter employee id: "); // id
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter employee name: "); // nome
			String name = sc.nextLine();
			
			System.out.print("Enter employee salary: "); // sal?rio
			double salary = sc.nextDouble();
			
			System.out.println("");
			
			//instancia??o e inserir funcion?rios na lista
			regEmployees.add(new Employee(id, name, salary));
			
		}
		
		//pedir input do aumento de sal?rio
		System.out.print("Enter the employee id that will have a salary increase: ");
		int eId = sc.nextInt();
		
		//procurar pelo usu?rio na lista pelo n?mero de id
		Employee empTemp = regEmployees.stream().filter(x -> x.getEmpId() == eId).findFirst().orElse(null);
		
		if (empTemp == null) {
			System.out.println("Esse id de usu?rio n?o existe!"); // erro - id n?o existe
		} else {
			System.out.println("Enter the percentage: "); // inserir porcentagem de aumento
			double sPerc = sc.nextDouble();
			empTemp.salaryIncrease(sPerc);
	
		}
		
		System.out.println("");
		
		//imprimir lista de funcion?rios
		System.out.println("List of employees: ");
		for (Employee x : regEmployees) {
			System.out.println(x);
		}			
		
		sc.close();

	}

}
