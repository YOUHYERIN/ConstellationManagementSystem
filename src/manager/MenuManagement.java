package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManagement {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ConstellationManager constellationManager = getObject("constellationmanager.ser");
		if (constellationManager == null) {
			constellationManager = new ConstellationManager(input);
		} else {
			constellationManager.input = input;
		}
		
		WindowFrame frame = new WindowFrame(constellationManager);
		selectMenu(input, constellationManager);
		putObject(constellationManager, "constellationmanager.ser");
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
					logger.log("add a constellation");
					break;
				case 2:
					constellationManager.deletConstellation();
					logger.log("delete a constellation");
					break;
				case 3:
					constellationManager.editConstellation();
					logger.log("edit a constellation");
					break;
				case 4:
					constellationManager.viewConstellations();
					logger.log("view a list of constellation");
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
	
	public static ConstellationManager getObject(String filename) {
		ConstellationManager constellationManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			constellationManager = (ConstellationManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return constellationManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return constellationManager;
	}
	
	public static void putObject(ConstellationManager constellationManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(constellationManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
