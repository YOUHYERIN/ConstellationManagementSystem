package Constellation;

import java.util.Scanner;

import exception.MainStarFormatException;

public class AutumnConstellation extends Constellation implements Constellationinput {

	protected String OutherStar;
	
	public AutumnConstellation(Constellationkind Kind) {
		super(Kind);
	}
	
	public void getUserInput(Scanner input) {
		setConstellationNumber(input);
		setConstellationName(input);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have an Main Star? (Y/N): ");
			answer =input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					System.out.println("Constellation MainStar: ");
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
		
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have an Other Star? (Y/N): ");
			answer =input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					System.out.println("Other Star Name: ");
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
		System.out.println("Kind: " + skind + "  Number: " + Number + "  Name: " + Name + "  MainStar: " + MainStar);
	}
}
