package Constellation;

import java.util.Scanner;

import exception.MainStarFormatException;

public abstract class WinterConstellation extends Constellation {
	
	public WinterConstellation(Constellationkind Kind) {
		super(Kind);
	}

	@Override
	public abstract void getUserInput(Scanner input); 

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: " + skind + "  Number: " + Number + "  Name: " + Name + "  MainStar: " + MainStar);
	}
	
	public void setConstellationMainStarwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have an Main Star? (Y/N): ");
			answer =input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					setConstellationMainStar(input);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setMainStar("");
					break;
				}
				else {
				}
			}
			catch(MainStarFormatException e) {
				System.out.println("Incorrect MainStar Format. Put the MainStar that contains '.'");
			}
		}
	}
	
	public void setConstellationOtherStarwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have an Other Star? (Y/N): ");
			answer =input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					System.out.println("Other Star Name: ");
					String MainStar = input.next();
					this.setName(MainStar);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setMainStar("");
					break;
				}
				else {
				}
			}
			catch(MainStarFormatException e) {
				System.out.println("Incorrect MainStar Format. Put the MainStar that contains '.'");
			}
		}
	}
}
