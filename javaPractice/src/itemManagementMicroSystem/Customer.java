package itemManagementMicroSystem;

import java.util.Scanner;

public class Customer implements View {

	@Override
	public void showView() {
		Scanner scanner = new Scanner(System.in);
		String code;
		System.out.println("ITEM MANAGEMENT MICROSYSTEM\n\nCUSTOMER VIEW");

		System.out.println("Enter the Item code you want");
		code = scanner.next();

	}

	public Item findItem(String code) {
		for (Item s : IMMS.itemList) {
			if (s.getCode().equalsIgnoreCase(code)) {
				return s;

			}
		}
		return null;
	}

}
