package entitites;

public class Employee {
	
	private Integer empId;
	private String empName;
	private Double empSalary;
	
	//contructor
	public Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	//getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	//função para aumentar salário recebendo porcentagem
	public void salaryIncrease(double percentage) {
		empSalary += empSalary * percentage / 100;
	}
	
	//tostring
	public String toString() {
		return empId + ", " + empName + ", " + String.format("%.2f", empSalary);
	}
	
	

}
