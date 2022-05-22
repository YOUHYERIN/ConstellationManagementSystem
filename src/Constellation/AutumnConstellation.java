package Constellation;

import java.util.Scanner;

import exception.MainStarFormatException;

public class AutumnConstellation extends WinterConstellation{

	protected String OutherStar;
	
	public AutumnConstellation(Constellationkind Kind) {
		super(Kind);
	}
	
	public void getUserInput(Scanner input) {
		setConstellationNumber(input);
		setConstellationName(input);
		setConstellationMainStarwithYN(input);
		setConstellationOtherStarwithYN(input);
	}
	
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: " + skind + "  Number: " + Number + "  Name: " + Name + "  MainStar: " + MainStar);
	}
}
