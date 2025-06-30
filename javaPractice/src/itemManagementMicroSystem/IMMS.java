package itemManagementMicroSystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface View {

	void showView();
}

public class IMMS {
	public static List<Item> itemList = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String view;

		while (true) {
			System.out.println("WELCOME TO ITEM MANAGEMENT MICROSYSTEM!\n");
			System.out.println("Please enter the view you want to explore (Customer or Admin): ");
			view = scanner.next();
			if (view.equalsIgnoreCase("exit")) {
				System.out.println("END");
				break;
			}
			View userChoice;
			if (view.equalsIgnoreCase("admin")) {
				clearScreen();
				userChoice = new Admin();
			} else if (view.equalsIgnoreCase("Customer")) {
				clearScreen();
				userChoice = new Customer();
				userChoice.showView();
				System.out.println("Do you want to go back to selection screen? Yes || No");
				view = scanner.next();
				if (view.equalsIgnoreCase("yes")) {
					continue;
				} else if (view.equalsIgnoreCase("No")) {
					clearScreen();
					System.out.println("Thank you for using the system\n\nShutting down...");
					break;
				}
			} else {
				clearScreen();
				System.out.println("Invalid");
				continue;
			}
			clearScreen();
			userChoice.showView();
			// Prompt the user to press Enter to return to the main selection screen
			System.out.print("\n\nPress ENTER to go back to the selection screen ");

			// Wait for the user to press Enter
			System.in.read();

			// Clear the console before showing the main menu again
			clearScreen();

			// Consume any remaining input to prevent it from affecting the next prompt
			while (System.in.available() > 0) {
				System.in.read();
			}

		}
		scanner.close();
	}

	public static void clearScreen() {
		// call this every time you switch interface
		// ANSI escape code to clear console (works in most terminals & IDEs like
		// IntelliJ)
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
