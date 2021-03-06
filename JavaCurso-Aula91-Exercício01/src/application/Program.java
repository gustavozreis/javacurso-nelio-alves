package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		
		//add locale and input scanner
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ask for input of rooms to be rented
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		//create rooms vector
		Room[] quartos = new Room[10];
		
		//ask for inputs of each room
		for (int i=0; i<n; i++) {
			System.out.print("Insert guest name: "); //guest name
			String name = sc.nextLine();
			
			System.out.print("Insert guest email: "); // guest email
			String email = sc.nextLine();
			
			System.out.print("Insert room number: "); // room number
			int roomNumber = sc.nextInt();
			sc.nextLine();
			
			System.out.println("");
		
			//create room instance on vector space
			quartos[roomNumber] = new Room(name, email, roomNumber);
			
		}
		
		//print out list off busy rooms
		System.out.println("Busy rooms:");
		
		for (int i=0; i<10; i++) {
			if (quartos[i] != null) {
				System.out.println(quartos[i].getRoomNumber() + ": " + quartos[i].getName() + ", " + quartos[i].getEmail());
			}
		}
		
		
		sc.close();

	}

}
