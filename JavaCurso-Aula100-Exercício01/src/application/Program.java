package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//input scanner
		Scanner input = new Scanner(System.in);
		
		//inputs tamanho matriz
		System.out.print("Insert matrix legth: ");
		int m = input.nextInt();
		System.out.print("Insert matrix height: ");
		int n = input.nextInt();
		
		//cria??o da matriz com inputs
		int[][] matrix01 = new int[m][n];
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				matrix01[i][j] = input.nextInt();
			}
		}
		
		//ler numero a ser conferido na matriz
		System.out.print("Insert number to be checked: ");
		int X = input.nextInt();
		
		//checar n?mero inserido
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (matrix01[i][j] == X) {
					System.out.println("Position " + i + ", " + j);
					if (j > 0)
						System.out.println("Left: " + matrix01[i][j - 1]);
					if (j < n - 1)
						System.out.println("Right: " + matrix01[i][j + 1]);
					if (i > 0)
						System.out.println("Up: " + matrix01[i - 1][j]);
					if (i < n - 1)
						System.out.println("Down: " + matrix01[i + 1][j]);
				}
			}
		}
		
		input.close();

	}

}
