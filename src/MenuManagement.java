import java.util.Scanner;

public class MenuManagement {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		ConstellationManager constellationManager = new ConstellationManager(input);
		
		while (num != 6) {
			System.out.println("1. Add Constellation");
			System.out.println("2. Delet Constellation");
			System.out.println("3. Edit Constellation");
			System.out.println("4. View Constellation");
			System.out.println("5. Show a menu");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-6: ");
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
				constellationManager.viewConstellation();
				break;
			}
		}
	}
}