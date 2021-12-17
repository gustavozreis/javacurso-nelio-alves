import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//inputs do usuario
		System.out.print("Enter account number: "); //número da conta
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder name: "); //nome do dono da conta
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? "); //checar se terá depósito inicial
		String initialDepositExists = sc.nextLine();
		
		Account conta01; //instanciar conta
				
		//checar se existirá depósito inicial
		
		if (initialDepositExists.equals("y")) {
			System.out.print("Enter initial deposit value: "); //pedir para inserir depósito inicial
			double initialDeposit = sc.nextDouble();
			conta01 = new Account(accountHolder, accountNumber, initialDeposit);
			System.out.println();
		} else {
			double initialDeposit = 0;
			conta01 = new Account(accountHolder, accountNumber, initialDeposit);
			System.out.println();
		}

		
		//printa dados da conta
		System.out.println("Account data:");
		conta01.toString();
		System.out.println();
		System.out.println();
		
		//novo deposito, insira valor
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		
		conta01.deposit(depositValue);

		//printa dados atualizados da conta
		System.out.println("Updated account data:");
		conta01.toString();
		System.out.println();
		System.out.println();
		
		//novo saque, insira valor
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		
		conta01.withdraw(withdrawValue);
		
		//printa dados atualizados da conta
		System.out.println("Updated account data:");
		conta01.toString();
		
		sc.close();
		
	}

}
