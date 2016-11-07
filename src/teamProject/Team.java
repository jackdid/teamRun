package teamProject;

public class Team {
	private String name;
	
	protected Team(String name){
		this.name=name;
		System.out.println("Brought into existance" + this.name);
				}
	
	public void surface(){
		System.out.println(this.name+" is played on special surface!");
	}
	
	public void players(){
		System.out.println(this.name+" has lots of players!" );
	}
	
	public void footwear(){
		System.out.println(this.name+" with cool equipment!");
	}
	
	public String getName(){
		return this.name;
	}
	
	}
