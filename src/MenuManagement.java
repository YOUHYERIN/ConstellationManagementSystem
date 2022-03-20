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
			switch (num) {
			case 1:
				System.out.print("Constellation Name: ");
				String ConstellationName = input.next();
				System.out.print("Constellation Main Star: ");
				String ConstellationMainStar = input.next();
				System.out.print("Observable Season(northern hemisphere standard): ");
				String ObservableSeason = input.next();
				break;
			case 2:
			case 3:
			case 4:
				System.out.print("Constellation Name: ");
				String ConstellationName2 = input.next();			
			}
			
		}

	}

}
