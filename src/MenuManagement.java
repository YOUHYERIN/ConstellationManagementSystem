import java.util.InputMismatchException;
import java.util.Scanner;

import exception.MainStarFormatException;

public class MenuManagement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ConstellationManager constellationManager = new ConstellationManager(input);
		
		selectMenu(input, constellationManager);
	}
	
	public static void selectMenu(Scanner input, ConstellationManager constellationManager) {
		int num = 0;
		while (num != 6) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					constellationManager.addConstellation();
					break;
				case 2:
					constellationManager.deletConstellation();
					break;
				case 3:
					constellationManager.editConstellation();
					break;
				case 4:
					constellationManager.viewConstellations();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Plese put an integer between 1 and 6!");
				if (input.hasNext()) {
					input.next();
				}
				num = 0;				
			} 
		}
	}
	
	public static void showMenu() {
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
