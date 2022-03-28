import java.util.Scanner;

public class MenuManagement {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add Constellation");
			System.out.println("2. Delet Constellation");
			System.out.println("3. Edit Constellation");
			System.out.println("4. View Constellation");
			System.out.println("5. Show a menu");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-6: ");
			num = input.nextInt();
			if (num == 1) {
				addConstellation();
			}
			else if (num == 2) {
				deletConstellation();
			}
			else if (num == 3) {
				editConstellation();
			}
			else if (num == 4) {
				viewConstellation();
			}
			else {
				continue;
			}
		}

	}

	public static void addConstellation() {
		Scanner input = new Scanner(System.in);
		System.out.print("Constellation Name: ");
		String ConstellationName = input.nextLine();
		System.out.println(ConstellationName);
		System.out.print("Constellations Main Star: ");
		String ConstellationMainStar = input.nextLine();
		System.out.println(ConstellationMainStar);
		System.out.print("Observable Season(northern hemisphere standard): ");
		String ObservableSeason = input.next();
		System.out.println(ObservableSeason);
		
	}
	public static void deletConstellation() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Delet Constellation Name: ");
		String DeletConstellationName = input.nextLine();
		System.out.println("Delet the " + DeletConstellationName + "?");
		System.out.print("Yes or No: ");
		String YON = input.next();
	}
	public static void editConstellation() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Edit Constellation Name: ");
		String EditConstellationName = input.nextLine();
		System.out.println(EditConstellationName);
		
	}
	public static void viewConstellation() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the View Constellation Name: ");
		String ViewConstellationName = input.nextLine();
		System.out.println(ViewConstellationName);
	}
}
