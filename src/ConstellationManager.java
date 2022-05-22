 import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Constellation.AutumnConstellation;
import Constellation.Constellationinput;
import Constellation.Constellationkind;
import Constellation.SpringConstellation;
import Constellation.SummerConstellation;

public class ConstellationManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3477057238430703522L;
	
	ArrayList<Constellationinput> constellations = new ArrayList<Constellationinput>();
	transient Scanner input;
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
		int index = findIndex(constellationNumber);
		removefromConstellation(index, constellationNumber);
	}
	
	public int findIndex(int constellationNumber) {
		int index = -1;
		for (int i = 0; i < constellations.size(); i++) {
			if (constellations.get(i).getNumber() == constellationNumber) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromConstellation(int index, int constellationNumber) {
		if (index >= 0) {
			constellations.remove(index);
			System.out.println("the constellation" + constellationNumber + "is deleted");
			return 1;
		}
		else {
			System.out.println("the constellation has not been registered");
			return 0;
		}
	}
		
	
	public void editConstellation() {
		System.out.print("Constellation Number: ");
		int constellationNumber = input.nextInt();
		for (int i = 0; i < constellations.size(); i++) {
			Constellationinput constellation = constellations.get(i);
			if (constellation.getNumber() == constellationNumber) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						constellation.setConstellationNumber(input);
						break;
					case 2:
						constellation.setConstellationName(input);
						break;
					case 3:
						constellation.setConstellationMainStar(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewConstellations() {
		System.out.println("# of registered constellations: " + constellations.size());
		for (int i = 0; i < constellations.size(); i++) {
			constellations.get(i).printInfo();
		}
	}
	
	public void showEditMenu() {
		System.out.println("*** Constellation Managment System Menu ***");
		System.out.println("1. Add Constellation");
		System.out.println("2. Delet Constellation");
		System.out.println("3. Edit Constellation");
		System.out.println("4. View Constellations");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6: ");
	}
}