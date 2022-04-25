package Constellation;

import java.util.Scanner;

public class SummerConstellation extends Constellation {
	
	public void getUserInput(Scanner input) {
		System.out.println("Constellation Number: ");
		int Number = input.nextInt();
		this.setNumber(Number);
		
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have an Main Star? (Y/N): ");
			answer =input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.println("Main Star Name: ");
				String MainStar = input.next();
				this.setMainStar(MainStar);
			}
			else if (answer == 'n' || answer == 'N') {
				this.setMainStar("");
			}
			else {
			}
		}
		
		
		System.out.print("Constellation Name: ");
		String Name = input.next();
		this.setName(Name);
		
		System.out.print("Constellation MainStar: ");
		String MainStar = input.next();
		this.setMainStar(MainStar);
	}
}
