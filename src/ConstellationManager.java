import java.util.Scanner;

public class ConstellationManager {
	Constellation constellation;
	Scanner input;
	ConstellationManager(Scanner input) {
		this.input = input;
	}
	
	public void addConstellation() {
		constellation = new Constellation();
		System.out.print("Constellation Name: ");
		constellation.Name = input.next();
		System.out.print("Constellation MainStar: ");
		constellation.MainStar = input.next();
		System.out.print("Constellation Season: ");
		constellation.Season = input.next();
	}
	
	public void deletConstellation() {
		System.out.print("Constellation Name: ");
		String constellationName = input.next();
		if (constellation == null) {
			System.out.println("the constellation has not been registered");
			return;
		}
		if (constellation.Name == constellationName) {
			constellation = null;
			System.out.println("the constellation is deleted");
		}
	}
	
	public void editConstellation() {
		System.out.print("Constellation Name: ");
		String constellationName = input.next();
		if (constellation.Name == constellationName) {
			System.out.println("the constellation to be edited is " + constellation.Name);
		}
	}
	
	public void viewConstellation() {
		System.out.print("Constellation Name: ");
		String constellationName = input.next();
		if (constellation.Name == constellationName) {
			constellation.printInfo();
		}
	}
}
