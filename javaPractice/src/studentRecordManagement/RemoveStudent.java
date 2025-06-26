package studentRecordManagement;

import java.util.Scanner;

public class RemoveStudent implements Guide {

	@Override
	public void showDashBoard() {
		Scanner scanner = new Scanner(System.in);
		String id, choice;
		System.out.println("This is Remove Student view");
		System.out.println("Please enter the student ID of the student that you want to remove");
		id = scanner.next();
		Student found = findStudent(id);
		if (found != null) {
			System.out.println("Student Found!\n" + "Name: " + found.getName() + " | " + "Age: " + found.getAge()
					+ "\n Do you really wish to remove this student from the record? (Yes or No)");
			choice = scanner.next();
			if (choice.equalsIgnoreCase("yes")) {
				StudentRecord.studentList.remove(found);
				System.out.println("Your action of student removal is successful");
			}
		} else {
			System.out.println("Student not found.");
		}

	}

	public Student findStudent(String id) {
		for (Student s : StudentRecord.studentList) {
			if (s.getId().equalsIgnoreCase(id)) {
				return s;
			}
		}
		return null;
	}

}
