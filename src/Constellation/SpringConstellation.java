package Constellation;

import java.util.Scanner;

public class SpringConstellation extends Constellation implements Constellationinput {
	
	public SpringConstellation(Constellationkind Kind) {
		super(Kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("Constellation Number: ");
		int Number = input.nextInt();
		this.setNumber(Number);
		
		System.out.print("Constellation Name: ");
		String Name = input.next();
		this.setName(Name);
		
		System.out.print("Constellation MainStar: ");
		String MainStar = input.next();
		this.setMainStar(MainStar);
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