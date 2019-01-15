package premierLeagueApp;

import java.util.Scanner;

public class SortMenu {
	
//	This class contains just menu method and in this class I create new Player class to get my main methods
	public void sortMenu() {
		Scanner in = new Scanner(System.in);
		System.out.println("1 - SORT by age\t\t2 - SORT by position\t\t3 - Sort by nationality\t\t4 - BACK\n");
		System.out.println("Your choise: ");
		String answer = in.nextLine();
		Player player = new Player();
		
		switch (answer) {
		case "1":
			System.out.println("Enter age to sort by: ");
			String searchTerm2 = in.nextLine();
			player.sortAge(searchTerm2);
			sortMenu();
			break;

		case "2":
			System.out.println("Enter position to sort by: ");
			String searchTerm3 = in.nextLine();
			player.sortPosition(searchTerm3);
			sortMenu();
			break;
			
		case "3":
			System.out.println("Enter nationality to sort by: ");
			String searchTerm = in.nextLine();
			player.sortNationality(searchTerm);
			sortMenu();
			break;
			
		case "4":
			SecondMenu secondMenu = new SecondMenu();
			secondMenu.secondMenu();
			break;
			
		default:
			System.out.println("Invalid input");
			sortMenu();
			break;
		}
	}
}
