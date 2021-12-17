
public class Account {

	private final int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	//construtor1
	Account(String accountHolder, int accountNumber, double initialDeposit) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		deposit(initialDeposit);		
	}
	
	//construtor2 - sem dep�sito inicial
	Account(String accountHolder, int accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;	
	}
	
	//getters e setters
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String holder) {
		this.accountHolder = holder;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}	

	public void deposit(double depositValue) {
		accountBalance += depositValue;
	}
	
	public void withdraw(double withdrawValue) {
		accountBalance = accountBalance - withdrawValue - 5.00;
	}
	
	//string dados da conta
	public String toString() {
		return "Account " 
				+ getAccountNumber() 
				+ " , Holder: " 
				+ getAccountHolder() 
				+ ", Balance: $ " 
				+ String.format("%.2f", getAccountBalance());
	}
	
}
