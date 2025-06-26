package itemManagementMicroSystem;

import java.util.Scanner;

public class Admin implements View {

	@Override
	public void showView() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ITEM MANAGEMENT MICROSYSTEM\n\nADMIN VIEW");
		int count;
//		String code, name;
		System.out.println("Enter the number of items you want to manage:");
		count = scanner.nextInt();
		String[] entries = new String[count];
		String[] names = new String[count];
		String[] prices = new String[count];
		System.out.println("Enter " + count + " code for every item: ");
		for (int i = 0; i < count; i++) {
			entries[i] = scanner.next();
		}
		for (String code : entries) {
			IMMS.itemList.add(new Item(code, "", ""));
		}
		System.out.println("Enter " + count + " name for every item: ");
		for (int i = 0; i < count; i++) {
			names[i] = scanner.next();
		}
		System.out.println("Enter " + count + " price for every item: ");
		for (int i = 0; i < count; i++) {
			prices[i] = scanner.next();
		}
		for (int i = 0; i < count; i++) {
			String c = entries[i];
			for (Item s : IMMS.itemList) {
				if (s.getCode().equalsIgnoreCase(c)) {
					s.setName(names[i]);
					s.setPrice(prices[i]);
				}
			}
		}
		clearScreen();
		System.out.println("ITEM MANAGEMENT MICROSYSTEM\n\nADMIN VIEW");
		System.out.print("Here are your item Codes\n|");
		for (Item s : IMMS.itemList) {
			System.out.print(" " + s.getCode() + " |");
		}
		System.out.print("\n\nHere are your item Names\n|");
		for (Item s : IMMS.itemList) {
			System.out.print(" " + s.getName() + " |");
		}
		System.out.print("\n\nHere are your item Prices\n|");
		for (Item s : IMMS.itemList) {
			System.out.print(" " + s.getPrice() + ".00 |");
		}
		System.out.println("Item information is now COMPLETED!");
	}

	public static void clearScreen() {
		// call this every time you switch interface
		// ANSI escape code to clear console (works in most terminals & IDEs like
		// IntelliJ)
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

}
