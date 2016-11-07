package teamProject;

public class FootballTeam extends Team {
	public FootballTeam(){
		super("FootballTeam");
	}

	public void surface(){
		System.out.println(getName()+" play on Grass!");}
	

	public void players(){
		System.out.println(getName()+" 11 players!");}
	
	/*public void footwear(){
		System.out.println(getName()+" in boots");
	}*/
}
