package premierLeagueApp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

// Main class which contains all main methods used in this application
public class Player {
	
// Creating the variables
	private String name;
	private String club;
	private String age;
	private String position;
	private String marketValue;
	private String nationality;
	private int teamID;

// Little Menu appears when user selects the team
	public void teamMenu() {

		Scanner in2 = new Scanner(System.in);

		System.out.println("\n1 - SHOW ALL PLAYERS IN THIS TEAM\t2 - BACK IN TEAM MENU");
		System.out.println("\nYour choise: ");
		String answer = in2.nextLine();

		switch (answer) {
		case "1":
			printPlayersTable(getTeamID());
			teamMenu();
			break;

		case "2":
			Menu menu = new Menu();
			break;
		default:
			System.out.println("Invalid input\n");
			Menu menu2 = new Menu();

		}
	}

//	Setters and Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(String marketValue) {
		this.marketValue = marketValue;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getTeamID() {
		return teamID;
	}

	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}

// Print players table depending on the selected team
	public void printPlayersTable(int teamIDToSort) {

		String file = "football.csv";
		
// Creating List for CSV class which reads the csv file
		List<String[]> playersData = CSV.read(file);
		
// Creating new Format Table object to store and format the rows
		FormatTable st = new FormatTable();
		
// if false (default) then no vertical lines are shown
		st.setShowVerticalLines(true);

// Setting the headers for the table
		st.setHeaders("Name", "Club", "Age", "Position", "Market Value (mln $)", "Nationality");

// Looping through players data list from the csv file and setting the values of csv data one by one
		for (String[] player : playersData) {

			setName(player[0]);
			setClub(player[1]);
			setAge(player[2]);
			setPosition(player[3]);
			setMarketValue(player[4]);
			setNationality(player[5]);
			setTeamID(Integer.parseInt(player[6]));

// Because we want to print just these players depending on users chosen team we add if statement
			if (teamIDToSort == teamID) {

// Adding the rows to the FormatTable object one by one
				st.addRow(getName(), getClub(), getAge(), getPosition(), getMarketValue(), getNationality());

			}

		}
// Printing everything
		st.print();
	}

	public void addPlayer() {

		try {

			Scanner in = new Scanner(System.in);
			System.out.println("Enter the full name of the player: ");
			String answerName = in.nextLine();
			System.out.println("Enter the Club: ");
			String answerClub = in.nextLine();
			System.out.println("Enter the age: ");
			String answerAge = in.nextLine();
			System.out.println("Enter a position: ");
			String answerPosition = in.nextLine();
			System.out.println("Enter a market value (mln $): ");
			String answerValue = in.nextLine();
			System.out.println("Enter a nationality: ");
			String answerNationality = in.nextLine();

			String number = "1";
			switch (answerClub.toLowerCase()) {
			case "arsenal":
				number = "1";
				break;
			case "bournemouth":
				number = "2";
				break;
			case "brighton":
				number = "3";
				break;
			case "burnley":
				number = "4";
				break;
			case "chelsea":
				number = "5";
				break;
			case "crystal palace":
				number = "6";
				break;
			case "everton":
				number = "7";
				break;
			case "huddersfield":
				number = "8";
				break;
			case "leicester city":
				number = "9";
				break;
			case "liverpool":
				number = "10";
				break;
			case "machester city":
				number = "11";
				break;
			case "manchester united":
				number = "12";
				break;
			case "newcastle united":
				number = "13";
				break;
			case "southampton":
				number = "14";
				break;
			case "stoke city":
				number = "15";
				break;
			case "swansea":
				number = "16";
				break;
			case "tottenham":
				number = "17";
				break;
			case "watford":
				number = "18";
				break;
			case "west brom":
				number = "19";
				break;
			case "west ham":
				number = "20";
				break;

			default:
				break;
			}

			FileWriter fstream = new FileWriter("football.csv", true);
			BufferedWriter fbw = new BufferedWriter(fstream);
			fbw.newLine();
			fbw.write(answerName + "," + answerClub + "," + answerAge + "," + answerPosition + "," + answerValue + ","
					+ answerNationality + "," + number);

			fbw.close();
			System.out.println("Player added successfully");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public void findPlayer(String searchName) {

		String file = "football.csv";
		List<String[]> playersData = CSV.read(file);
		FormatTable st = new FormatTable();
		st.setShowVerticalLines(true);// if false (default) then no vertical lines are shown
		st.setHeaders("Name", "Club", "Age", "Position", "Market Value (mln €)", "Nationality");

		for (String[] player : playersData) {

			setName(player[0]);
			setClub(player[1]);
			setAge(player[2]);
			setPosition(player[3]);
			setMarketValue(player[4]);
			setNationality(player[5]);
			setTeamID(Integer.parseInt(player[6]));

			if (getName().equals(searchName)) {

				st.addRow(getName(), getClub(), getAge(), getPosition(), getMarketValue(), getNationality());

			}

		}
		st.print();
	}

	public void sortNationality(String searchTerm) {

		String file = "football.csv";
		List<String[]> playersData = CSV.read(file);
		FormatTable st = new FormatTable();
		st.setShowVerticalLines(true);// if false (default) then no vertical lines are shown
		st.setHeaders("Name", "Club", "Age", "Position", "Market Value (mln €)", "Nationality");

		for (String[] player : playersData) {

			setName(player[0]);
			setClub(player[1]);
			setAge(player[2]);
			setPosition(player[3]);
			setMarketValue(player[4]);
			setNationality(player[5]);
			setTeamID(Integer.parseInt(player[6]));

			if (getNationality().toLowerCase().equals(searchTerm.toLowerCase())) {

				st.addRow(getName(), getClub(), getAge(), getPosition(), getMarketValue(), getNationality());

			}

		}
		st.print();
	}
	
	public void sortAge(String searchTerm) {

		String file = "football.csv";
		List<String[]> playersData = CSV.read(file);
		FormatTable st = new FormatTable();
		st.setShowVerticalLines(true);// if false (default) then no vertical lines are shown
		st.setHeaders("Name", "Club", "Age", "Position", "Market Value (mln €)", "Nationality");

		for (String[] player : playersData) {

			setName(player[0]);
			setClub(player[1]);
			setAge(player[2]);
			setPosition(player[3]);
			setMarketValue(player[4]);
			setNationality(player[5]);
			setTeamID(Integer.parseInt(player[6]));

			if (getAge().equals(searchTerm)) {

				st.addRow(getName(), getClub(), getAge(), getPosition(), getMarketValue(), getNationality());

			}

		}
		st.print();
	}
	
	public void sortPosition(String searchTerm) {

		String file = "football.csv";
		List<String[]> playersData = CSV.read(file);
		FormatTable st = new FormatTable();
		st.setShowVerticalLines(true);// if false (default) then no vertical lines are shown
		st.setHeaders("Name", "Club", "Age", "Position", "Market Value (mln €)", "Nationality");

		for (String[] player : playersData) {

			setName(player[0]);
			setClub(player[1]);
			setAge(player[2]);
			setPosition(player[3]);
			setMarketValue(player[4]);
			setNationality(player[5]);
			setTeamID(Integer.parseInt(player[6]));

			if (getPosition().toLowerCase().equals(searchTerm.toLowerCase())) {

				st.addRow(getName(), getClub(), getAge(), getPosition(), getMarketValue(), getNationality());

			}

		}
		st.print();
	}

}
