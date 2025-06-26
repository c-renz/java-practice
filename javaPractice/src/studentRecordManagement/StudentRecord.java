package studentRecordManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Guide { // when implements on other class inside the same packages, requires to create
					// method that class
	void showDashBoard();
}

public class StudentRecord {
	public static List<Student> studentList = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String choice;
		while (true) {
			System.out.println("Welcome to Student Management System: " + "\n1. Add Student" + "\n2. View All Students"
					+ "\n3. Update Students" + "\n4. Remove Student"
					+ "\nWhere do you wish to go? (please enter the number of your choice) ");
			choice = scanner.next();// this gets the input after print the string above
			if (choice.equalsIgnoreCase("exit")) {
				System.out.println("END");
				break;
			}
			Guide userChoice;
			if (choice.equalsIgnoreCase("1")) {
				clearScreen();
				userChoice = new AddStudent(); // getting the AddStudent class, to show dash board later
			} else if (choice.equalsIgnoreCase("2")) {
				clearScreen();
				userChoice = new ViewAllStudents();
			} else if (choice.equalsIgnoreCase("3")) {
				clearScreen();
				userChoice = new UpdateStudent();
			} else if (choice.equalsIgnoreCase("4")) {
				clearScreen();
				userChoice = new RemoveStudent();
			} else {
				clearScreen();
				System.out.println("Error");
				continue;
			}
			clearScreen();
			userChoice.showDashBoard();
			// Prompt the user to press Enter to return to the main selection screen
			System.out.print("\n\nPress Enter to go back to the selection screen ");

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
