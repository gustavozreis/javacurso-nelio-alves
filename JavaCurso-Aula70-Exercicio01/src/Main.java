import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//idioma entrada e input scanner
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		//pedir input de altura, largura
		System.out.println("Enter rectangle width and height:");
		double rectangleWidth = sc.nextDouble();
		double rectangleHeight = sc.nextDouble();
		
		//instanciar objeto da classe Rectangle com parametros do input
		Rectangle rectangle1 = new Rectangle(rectangleWidth, rectangleHeight);
		
		//chamar funcao resultado que printa valores na tela
		rectangle1.resultado();
		
		sc.close();		

	}

}
