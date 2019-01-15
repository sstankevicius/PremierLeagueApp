package premierLeagueApp;

import java.util.Scanner;

//	Second menu which creates new Player class and uses this class methods depending on user's chosen option
public class SecondMenu {

	public void secondMenu() {
		Scanner in2 = new Scanner(System.in);
		System.out.println(
				"\n1 - ADD player to the database\t\t2 - FIND player by name\t\t3 - SORT BY\t\t4 - BACK to start");
		System.out.println("\nYour choise: ");
		String answer = in2.nextLine();

//	Creating new Player class so in switch statement just using Player class methods
		Player player = new Player();

		switch (answer) {
		case "1":

			player.addPlayer();
			System.out.println("Press any key to SAVE AND BACK TO MENU");
			String anyKey = in2.nextLine();
			secondMenu();
			break;

		case "2":
			System.out.println("Enter the name of the player: ");
			String findName = in2.nextLine();
			player.findPlayer(findName);
			secondMenu();
			break;

		case "3":
//	Creating another class - SortMenu witch contains another menu for SORT BY options
			SortMenu sortMenu = new SortMenu();
			sortMenu.sortMenu();
			
		case "4":
//	Creating Menu class and calling constructor so we can come back in main menu
			Menu menu = new Menu();
			break;
			
		default:
			System.out.println("Invalid input\n");
			secondMenu();
			break;
		}

	}
}
