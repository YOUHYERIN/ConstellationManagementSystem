package Constellation;

import java.util.Scanner;

public class Constellation {
	protected Constellationkind kind = Constellationkind.Spring;
	protected String Name;
	protected String MainStar;
	protected int Number;
	
	public Constellation() {
	}
	
	public Constellation(int Number, String Name) {
		this.Number = Number;
		this.Name = Name;
	}
	
	public Constellation(int Number, String name, String MainStar) {
		this.Number = Number;
		this.Name = Name;
		this.MainStar = MainStar;
	}
	public Constellationkind getKind() {
		return kind;
	}

	public void setKind(Constellationkind kind) {
		this.kind = kind;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMainStar() {
		return MainStar;
	}

	public void setMainStar(String mainStar) {
		MainStar = mainStar;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}


	public void printInfo() {
		System.out.println("Number: " + Number + "Name: " + Name + "MainStar: " + MainStar);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("Constellation Number: ");
		int Number = input.nextInt();
		this.setNumber(Number);
		
		System.out.print("Constellation Name: ");
		String Name = input.next();
		this.setName(Name);
		
		System.out.print("Constellation MainStar: ");
		String MainStar = input.next();
		this.setMainStar(MainStar);
	}
}
