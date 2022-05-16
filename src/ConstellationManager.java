import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Constellation.AutumnConstellation;
import Constellation.Constellation;
import Constellation.Constellationinput;
import Constellation.Constellationkind;
import Constellation.SpringConstellation;
import Constellation.SummerConstellation;
import exception.MainStarFormatException;

public class ConstellationManager {
	ArrayList<Constellationinput> constellations = new ArrayList<Constellationinput>();
	Scanner input;
	ConstellationManager(Scanner input) {
		this.input = input;
	}
	
	public void addConstellation() {
		int kind = 0;
		Constellationinput constellationinput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Spring");
				System.out.println("2 for Summer");
				System.out.println("3 for Autumn");
				System.out.println("Selec num for 1, 2, or 3 Constellation Kind: ");
				kind = input.nextInt();
				if (kind == 1) {
					constellationinput = new SpringConstellation(Constellationkind.Spring);
					constellationinput.getUserInput(input);
					constellations.add(constellationinput);
					break;
				}
				else if (kind == 2) {
					constellationinput = new SummerConstellation(Constellationkind.Summer);
					constellationinput.getUserInput(input);
					constellations.add(constellationinput);
					break;
				}
				else if (kind == 3) {
					constellationinput = new AutumnConstellation(Constellationkind.Autumn);
					constellationinput.getUserInput(input);
					constellations.add(constellationinput);
					break;
				}
				else {
					System.out.println("Selec num for 1, 2, or 3 Constellation Kind: ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Plese put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = 0;	
			}
		}
	}
	
	public void deletConstellation() {
		System.out.print("Constellation Nmber: ");
		int constellationNumber = input.nextInt();
		int index = -1;
		for (int i = 0; i < constellations.size(); i++) {
			if (constellations.get(i).getNumber() == constellationNumber) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			constellations.remove(index);
			System.out.println("the constellation" + constellationNumber + "is deleted");
		}
		else {
			System.out.println("the constellation has not been registered");
			return;
		}
	}
		
	
	public void editConstellation() {
		System.out.print("Constellation Number: ");
		int constellationNumber = input.nextInt();
		for (int i = 0; i < constellations.size(); i++) {
			Constellationinput constellationinput = constellations.get(i);
			if (constellationinput.getNumber() == constellationNumber) {
				int num = -1;
				while (num != 5) {
					System.out.println("** Constellation Info Edit Menu **");
					System.out.println("1. Edit Number");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit MainStar");
					System.out.println("4. Exit");
					System.out.println("Select one number between 1 - 5: ");
					num = input.nextInt();
					if (num == 1) {
						System.out.println("Constellation Number: ");
						int Number = input.nextInt();
						constellationinput.setNumber(Number);
					}
					else if (num == 2) {
						System.out.println("Constellation Name: ");
						String Name = input.next();
						constellationinput.setName(Name);
					}
					else if (num == 3) {
						System.out.println("Constellation MainStar: ");
						String MainStar = input.next();
						try {
							constellationinput.setMainStar(MainStar);
						} catch (MainStarFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewConstellations() {
//		System.out.print("Constellation Name: ");
//		String constellationName = input.next();
		System.out.println("# of registered constellations: " + constellations.size());
		for (int i = 0; i < constellations.size(); i++) {
			constellations.get(i).printInfo();
		}
	}
}