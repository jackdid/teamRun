package teamProject;

public class HockeyTeam extends Team {
	public HockeyTeam(){
		super("HockeyTeam");
	}

	public void surface(){
		System.out.println(getName()+" play on Ice!");}
	

	public void players(){
		System.out.println(getName()+" 6 players in the rink!");}
	
	public void footwear(){
		System.out.println(getName()+" on skates");
	}
}