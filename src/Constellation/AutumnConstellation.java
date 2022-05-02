package Constellation;

import java.util.Scanner;

public class AutumnConstellation extends Constellation {

	protected String OutherStar;
	
	public void getUserInput(Scanner input) {
		System.out.println("Constellation Number: ");
		int Number = input.nextInt();
		this.setNumber(Number);
		
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have an Other Star? (Y/N): ");
			answer =input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.println("Other Star Name: ");
				String AlphaStar = input.next();
				this.setAlphaStar(AlphaStar);
			}
			else if (answer == 'n' || answer == 'N') {
				this.setAlphaStar("");
			}
			else {
			}
		}
		
		
		System.out.print("Constellation Name: ");
		String Name = input.next();
		this.setName(Name);
		
		System.out.print("Constellation Season: ");
		String Season = input.next();
		this.setSeason(Season);
	}
}
