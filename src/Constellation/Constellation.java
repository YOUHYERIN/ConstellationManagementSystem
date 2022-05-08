package Constellation;

import java.util.Scanner;

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

	public void setMainStar(String mainStar) {
		MainStar = mainStar;
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

}
