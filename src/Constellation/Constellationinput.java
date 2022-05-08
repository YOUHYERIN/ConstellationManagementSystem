package Constellation;

import java.util.Scanner;

public interface Constellationinput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void setMainStar(String mainStar);

	public void getUserInput(Scanner input);
	
	public void printInfo();
}
