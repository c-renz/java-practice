package itemManagementMicroSystem;

import java.util.Scanner;

public class Admin implements View {

	@Override
	public void showView() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ITEM MANAGEMENT MICROSYSTEM\nADMIN VIEW");
		int count;
		String code, name;
		System.out.println("Enter the number of items you want to manage:");
		count = scanner.nextInt();

	}

}
