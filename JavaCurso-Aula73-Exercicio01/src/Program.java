import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//idioma input	
		Locale.setDefault(Locale.US);
		//scanner input
		Scanner sc = new Scanner(System.in);
		
		//pedir para inserir o valor do d�lar
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		//pedir para inserir quantos d�lares ser�o comprados
		System.out.print("How many dollars will be bought? ");
		double dollarBought = sc.nextDouble();
		
		//retornar valor da convers�o chamando m�todo da classe
		CurrencyConverter.conversor(dollarPrice, dollarBought);

	}

}
