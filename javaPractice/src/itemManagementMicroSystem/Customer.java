package itemManagementMicroSystem;

import java.util.Scanner;

public class Customer implements View {
	Scanner scanner = new Scanner(System.in);
	String code;

	@Override
	public void showView() {

		makeAgain();
	}

	public Item findItem(String code) {
		for (Item s : IMMS.itemList) {
			if (s.getCode().equalsIgnoreCase(code)) {
				return s;

			}
		}
		return null;
	}

	public boolean makeAgain() {
		System.out.println("ITEM MANAGEMENT MICROSYSTEM\n\nCUSTOMER VIEW");
		System.out.println("Enter the Item code you want:");
		code = scanner.next();
		Item found = findItem(code);
		if (found != null) {
			clearScreen();
			System.out.println("ITEM MANAGEMENT MICROSYSTEM\n\nCUSTOMER VIEW");
			System.out.println("You ordered " + found.getCode() + " - " + found.getName());
			System.out.println("The price of this item is Php " + found.getPrice() + ".00 \nThank you for ordering!");
			System.out.println("Do you want to order again? Yes || No");
			String ans = scanner.next();
			if (ans.equalsIgnoreCase("Yes")) {
				clearScreen();
				makeAgain();
			} else {
				return false;
			}
		} else {
			System.out.println("Item not found. Do you want to enter the code again? Yes || No");
			String ans = scanner.next();
			if (ans.equalsIgnoreCase("Yes")) {
				clearScreen();
				makeAgain();
			} else {
				return false;
			}
		}
		return false;
	}

	public static void clearScreen() {
		// call this every time you switch interface
		// ANSI escape code to clear console (works in most terminals & IDEs like
		// IntelliJ)
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

}
