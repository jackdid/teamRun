package teamProject;

import java.util.Arrays;
import java.util.List;

public class Runner {
	public static void main(String[] args){
		
	

	List<Team> team = getSomeTeam();
	System.out.println();
	System.out.println("Team info");
	System.out.println();
	
		for(Team example: team){
			example.footwear();
			example.surface();
			example.players();
		}
	
	}
public static List <Team> getSomeTeam(){
	List<Team> team = Arrays.asList(new FootballTeam(), new BasketballTeam(), new HockeyTeam());
	return team;}
	
}
