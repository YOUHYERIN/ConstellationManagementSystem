package Constellation;

import java.util.Scanner;

import exception.MainStarFormatException;

public class SummerConstellation extends WinterConstellation {
	
	public SummerConstellation(Constellationkind Kind) {
		super(Kind);
	}
		
	public void getUserInput(Scanner input) {
		setConstellationNumber(input);
		setConstellationName(input);
		setConstellationMainStarwithYN(input);
	}
}
