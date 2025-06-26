package studentRecordManagement;

import java.util.Scanner;

public class UpdateStudent implements Guide {

	@Override
	public void showDashBoard() {
		Scanner scanner = new Scanner(System.in);
		String id, choice;
		int ageChoice;
		System.out.println("This is the Update Student View");
		System.out.println("Please enter the ID of the student you want to update");
		id = scanner.next();

		Student found = findStudent(id);
		if (found != null) {
			System.out.println("Student Found!\nName:" + found.getName() + " | " + "Age: " + found.getAge() + " | "
					+ found.getId());
			System.out.println("What do you want to update? (Name, Age, id)");
			choice = scanner.next();

			if (choice.equalsIgnoreCase("name")) {
				System.out.println(
						"Please enter the name you want replace with the current name '" + found.name + '\'' + ": ");
				choice = scanner.next();
				found.setName(choice);
				System.out.println("Successful!");
			} else if (choice.equalsIgnoreCase("age")) {
				System.out.println(
						"Please enter the name you want replace with the current age '" + found.age + '\'' + ": ");
				ageChoice = scanner.nextInt();
				found.setAge(ageChoice);
				System.out.println("Successful!");
			} else if (choice.equalsIgnoreCase("id")) {
				System.out.println(
						"Please enter the name you want replace with the current ID '" + found.id + '\'' + ": ");
				choice = scanner.next();
				found.setId(choice);
				System.out.println("Successful!");
			} else {
				System.out.println("Invalid");
			}
		} else {
			System.out.println("Student not found");
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
