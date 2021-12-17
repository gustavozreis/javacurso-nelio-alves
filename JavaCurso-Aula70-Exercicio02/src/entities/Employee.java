package entities;

public class Employee {

	String name;
	double grossSalary;
	double tax;
	
	//constructor
	public Employee(String eName, double eGrossSalary, double eTax) {
		name = eName;
		grossSalary = eGrossSalary;
		tax = eTax;
	}
	
	//net salary method
	public double netSalary() {
		return grossSalary - tax;
	}
	
	//increase salary method (prints out)
	public void increaseSalary(double percentage) {
		grossSalary = grossSalary + (grossSalary * percentage / 100);
		System.out.println("Updated data: " + name + ", $ " + netSalary());
	}
	
	//class data (could've been a .toString())
	public void employeeData() {
		System.out.println("Name: " + name + ", $ " + netSalary());

	}
	
	
}
