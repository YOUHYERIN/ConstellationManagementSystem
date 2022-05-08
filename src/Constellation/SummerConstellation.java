package Constellation;

import java.util.Scanner;

public class SummerConstellation extends Constellation implements Constellationinput {
	
	public SummerConstellation(Constellationkind Kind) {
		super(Kind);
	}
	
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
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Spring:
			skind = "Spring.";
			break;
		case Summer:
			skind = "Summer.";
			break;
		case Autumn:
			skind = "Autumn.";
			break;
		case Winter:
			skind = "Winter.";
			break;
		default:
		}
		System.out.println("Kind: " + skind + "Number: " + Number + "Name: " + Name + "MainStar: " + MainStar);
	}
}
