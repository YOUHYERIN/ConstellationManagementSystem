public class Constellation {

	String Name;
	String MainStar;
	String Season;
	
	public Constellation() {
	}
	
	public Constellation(String Name, String MainStar) {
		this.Name = Name;
		this.MainStar = MainStar;
	}
	
	public Constellation(String name, String MainStar, String Season) {
		this.Name = Name;
		this.MainStar = MainStar;
		this.Season = Season;
	}
	
	public void printInfo() {
		System.out.println("Name: " + Name + "MainStar: " + MainStar + "Season: " + Season);
	}
}
