package Constellation;

import java.util.Scanner;

import exception.MainStarFormatException;

public abstract class Constellation {
	protected Constellationkind kind = Constellationkind.Spring;
	protected String Name;
	protected String MainStar;
	protected String Season;
	protected int Number;
	
	public Constellation() {
	}
	
	public Constellation(Constellationkind Kind) {
		this.kind = Kind;
	}
	
	public Constellation(int Number, String Name) {
		this.Number = Number;
		this.Name = Name;
	}
	
	public Constellation(Constellationkind kind, int Number, String Name, String MainStar, String Season) {
		this.kind = kind;
		this.Number = Number;
		this.Name = Name;
		this.Season = Season;
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

	public String getMainStarr() {
		return MainStar;
	}

	public void setMainStar(String mainStar) throws MainStarFormatException {
		if (!mainStar.contains(".") && !mainStar.equals("")) {
			throw new MainStarFormatException();
		}
		this.MainStar = mainStar;
	}
	
	public String getSeason() {
		return Season;
	}
	
	public void setSeason(String season) {
		Season = season;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public abstract void printInfo();
	
	public void setConstellationNumber(Scanner input) {
		System.out.println("Constellation Number: ");
		int Number = input.nextInt();
		this.setNumber(Number);
	}
	
	public void setConstellationName(Scanner input) {
		System.out.print("Constellation Name: ");
		String Name = input.next();
		this.setName(Name);
	}
	
	public void setConstellationMainStar(Scanner input) {
		String mainStar = "";
		while (!mainStar.contains(".")) {
			System.out.println("Constellation MainStar: ");
			mainStar = input.next();
			try {
				this.setMainStar(mainStar);
			} catch (MainStarFormatException e) {
				System.out.println("Incorrect MainStar Format. Put the MainStar that contains '.'");
			}
		}
	}
	
	public String getKindSrting() {
		String skind = "none";
		switch(this.kind) {
		case Spring:
			skind = "Spr";
			break;
		case Summer:
			skind = "Sum";
			break;
		case Autumn:
			skind = "Aut";
			break;
		case Winter:
			skind = "Win";
			break;
		default:
		}
		return skind;
	}

}
