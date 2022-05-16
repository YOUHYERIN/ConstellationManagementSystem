package Constellation;

import java.util.Scanner;

import exception.MainStarFormatException;

public interface Constellationinput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void setMainStar(String mainStar) throws MainStarFormatException;

	public void getUserInput(Scanner input);
	
	public void printInfo();
}
