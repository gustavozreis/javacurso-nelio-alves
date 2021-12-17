
public class CurrencyConverter {
	
	//method to convert currency to dollar + tax - retorna print
	
	public static void conversor(double dollarPrice, double dollarBougth) {
		double total = dollarPrice * dollarBougth + ((dollarPrice * dollarBougth) * 0.06);
		System.out.printf("Amount to be paid in reais = %.2f ", total);
	}
			
	
}
