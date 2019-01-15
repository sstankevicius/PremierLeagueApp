package premierLeagueApp;

import java.util.Scanner;

//	Main Menu class to create a Menu
public class Menu {

//	Constructor
	public Menu() {

//	Formating Welcome message for the user and possible options for the menu
		Scanner in = new Scanner(System.in);

		System.out.println("\n\t\t\t        **************************************"
				 + "\n\t\t\t        * WELCOME TO PREMIER LEAGUE DATABASE *\n\t\t\t\t"
				 + "*            Choose Team!!!          *"
				 + "\n\t\t\t        **************************************\n");
		
		System.out.println(
				"\n1 - Arsenal\n"
				+ "2 - Bournemouth\n"
				+ "3 - Brighton\n"
				+ "4 - Burnley\n"
				+ "5 - Chelsea\n"
				+ "6 - Crystal Palace\n"
				+ "7 - Everton\t\n"
				+ "8 - Huddersfield\n"
				+ "9 - Leicester City\n"
				+ "10 - Liverpool\n"
				+ "11 - Manchester city\n"
				+ "12 - Manchester United\n"
				+ "13 - Newcastle Unite\n"
				+ "14 - Southampton\n"
				+ "15 - Stoke City\n"
				+ "16 - Swansea\n"
				+ "17 - Tottenham\n"
				+ "18 - Watford\n"
				+ "19 - West Brom\n"
				+ "20 - West Ham"
				+ "\n\n*******************************************************\n"
				+ "\n21 - OPEN MENU (add/find/sort)\t\t22 - EXIT\n");
		
//	Getting value from the user and storing in the variable
		System.out.println("Your choise: ");
		String answer = in.next();
		
//	Switch statement depending on user's input
//  Depending on the user's input creating new Player classes witch has main program methods and calling that methods
//	Setting TeamID depending on the users input, because in CSV file all teams have specific team ID.
		switch (answer) {
		case "1":
			System.out.println("\tArsenal");
			System.out.println("\t*******\n");
			Player player = new Player();
			player.setTeamID(1);
			player.teamMenu();

			break;

		case "2":
			System.out.println("\tBournemouth");
			System.out.println("\t***********\n");
			Player player2 = new Player();
			player2.setTeamID(2);
			player2.teamMenu();
			break;

		case "3":
			System.out.println("\tBrighton");
			System.out.println("\t********\n");
			Player player3 = new Player();
			player3.setTeamID(3);
			player3.teamMenu();
			break;

		case "4":
			System.out.println("\tBurnley");
			System.out.println("\t*******\n");
			Player player4 = new Player();
			player4.setTeamID(4);
			player4.teamMenu();
			break;

		case "5":
			System.out.println("\tChelsea");
			System.out.println("\t*******\n");
			Player player5 = new Player();
			player5.setTeamID(5);
			player5.teamMenu();
			break;

		case "6":
			System.out.println("\tCrystal Palace");
			System.out.println("\t**************\n");
			Player player6 = new Player();
			player6.setTeamID(6);
			player6.teamMenu();
			break;

		case "7":
			System.out.println("\tEverton");
			System.out.println("\t*******\n");
			Player player7 = new Player();
			player7.setTeamID(7);
			player7.teamMenu();
			break;

		case "8":
			System.out.println("\tHuddersfield");
			System.out.println("\t************\n");
			Player player8 = new Player();
			player8.setTeamID(8);
			player8.teamMenu();
			break;

		case "9":
			System.out.println("\tLeicester City");
			System.out.println("\t**************\n");
			Player player9 = new Player();
			player9.setTeamID(9);
			player9.teamMenu();
			break;

		case "10":
			System.out.println("\tLiverpool");
			System.out.println("\t*********\n");
			Player player10 = new Player();
			player10.setTeamID(10);
			player10.teamMenu();
			break;

		case "11":
			System.out.println("\tManchester City");
			System.out.println("\t***************\n");
			Player player11 = new Player();
			player11.setTeamID(11);
			player11.teamMenu();
			break;

		case "12":
			System.out.println("\tManchester United");
			System.out.println("\t*****************\n");
			Player player12 = new Player();
			player12.setTeamID(12);
			player12.teamMenu();
			break;

		case "13":
			System.out.println("\tNewcastle United");
			System.out.println("\t****************\n");
			Player player13 = new Player();
			player13.setTeamID(13);
			player13.teamMenu();
			break;

		case "14":
			System.out.println("\tSouthamptom");
			System.out.println("\t***********\n");
			Player player14 = new Player();
			player14.setTeamID(14);
			player14.teamMenu();
			break;

		case "15":
			System.out.println("\tStoke City");
			System.out.println("\t**********\n");
			Player player15 = new Player();
			player15.setTeamID(15);
			player15.teamMenu();
			break;

		case "16":
			System.out.println("\tSwansea");
			System.out.println("\t*******\n");
			Player player16 = new Player();
			player16.setTeamID(16);
			player16.teamMenu();
			break;

		case "17":
			System.out.println("\tTottenham");
			System.out.println("\t*********\n");
			Player player17 = new Player();
			player17.setTeamID(17);
			player17.teamMenu();
			break;

		case "18":
			System.out.println("\tWatford");
			System.out.println("\t*******\n");
			Player player18 = new Player();
			player18.setTeamID(18);
			player18.teamMenu();
			break;

		case "19":
			System.out.println("\tWest Brom");
			System.out.println("\t*********\n");
			Player player19 = new Player();
			player19.setTeamID(19);
			player19.teamMenu();
			break;

		case "20":
			System.out.println("\tWest Ham");
			System.out.println("\t********\n");
			Player player20 = new Player();
			player20.setTeamID(20);
			player20.teamMenu();
			break;

		case "21":
			SecondMenu secondMenu = new SecondMenu();
			secondMenu.secondMenu();
			break;
		
		case "22":
			System.out.println("\t\t\t\t\t*********************************\n"
							 + "\t\t\t\t\t* THANKS FOR USING OUR DATABASE *\n"
							 + "\t\t\t\t\t*********************************");
			break;
			
		default:
			System.out.println("Invalid input\n");
			Menu menu = new Menu();
		}
	}

}
