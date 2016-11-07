package teamProject;

public class BasketballTeam extends Team {
	public BasketballTeam(){
		super("BasketballTeam");
	}

	public void surface(){
		System.out.println(getName()+" play on wooden corts!");}
	

	public void players(){
		System.out.println(getName()+" 5 players!");}
	
	public void footwear(){
		System.out.println(getName()+" in sneakers");
	}
}