/* NFL Player Class, A class for the creation of NFL Players 
 * Milestone 2 Assignment 
 * Week2 CST100
 * File: NFLPlayer.java
 * Date: July 3 2016
 * Author: Lee Tompkins 
 */
public class NFLPlayer {
	// variable declaration
	private String name;
	private String playerType;    // Offense of Defense 
	private int yearsPro;
	private int careerTD;
	private int careerTackles;
	private int careerYards;
	private int age;
	

	// Methods
	
	public void  setName(String newName) {
		// Set Name 
		name = newName;
	}
	public void setType(String newPlayerType){
		// Set Type
		playerType = newPlayerType;
	}
	public void setYears(int newYearsPro){
		//Set years Pro
		yearsPro = newYearsPro;
	} 
	public void setTD(int newCareerTD){
		// Set Career TD's 
		careerTD = newCareerTD;
	}
	public void setTackle(int newCareerTackles){
		// Set Career Tackles 
		careerTackles = newCareerTackles;
	}
	public void setYards(int newCareerYards){
		// Set Career Yards
		careerYards = newCareerYards;
	}
	public String getName(){
		// Get player name 
		return name;
	}
	public String getPlayerType(){
		// Get player type
		return playerType;
	}
	public int getYearsPro(){
		// Get years Pro
		return yearsPro;
	}
	public int getCareerTD(){
		// Get career TD's
		return careerTD;
	}
	public int getCareerTackles(){
		// Get career tackles 
		return careerTackles;
	}
	public int getCareerYards(){
		// Get career Yards
		return careerYards;
	}
	public int getAge(){
		// Get player age 
		return age;
	}
	
	// Constructors 
	
	NFLPlayer() {
		
	}
	
	NFLPlayer(String name, String playerType, int yearsPro, int careerTD, int careerTackles, int careerYards, int careerAge) {
		
	}
}
