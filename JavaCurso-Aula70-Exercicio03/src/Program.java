import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		//idioma input
		Locale.setDefault(Locale.US);
		//scanner input
		Scanner sc = new Scanner(System.in);
		
		//pedir input 'nome do aluno'
		System.out.print("Insira o nome do aluno: ");
		String nomeAluno = sc.nextLine();
		
		//pedir input '3 notas do aluno'
		System.out.print("Insira as 3 notas do aluno: ");
		double primeiraNota = sc.nextDouble();
		double segundaNota = sc.nextDouble();
		double terceiraNota = sc.nextDouble();
		
		//instanciar aluno
		Alunos alexGreen = new Alunos(nomeAluno, primeiraNota, segundaNota, terceiraNota);

		//retornar dados do aluno
		alexGreen.dadosAluno();
				
		sc.close();

	}


}
