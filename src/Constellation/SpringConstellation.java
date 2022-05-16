package Constellation;

import java.util.Scanner;

import exception.MainStarFormatException;

public class SpringConstellation extends Constellation implements Constellationinput {
	
	public SpringConstellation(Constellationkind Kind) {
		super(Kind);
	}
	
	public void getUserInput(Scanner input) {
		setConstellationNumber(input);
		setConstellationName(input);
		setConstellationMainStar(input);

	}
	
	public void printInfo() {
		String skind = getKindSrting();
		System.out.println("Kind: " + skind + "  Number: " + Number + "  Name: " + Name + "  MainStar: " + MainStar);
	}
}
