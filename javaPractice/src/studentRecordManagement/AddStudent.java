package studentRecordManagement;

import java.util.Scanner;

public class AddStudent implements Guide {

	@Override
	public void showDashBoard() {
		String name, id;
		int age;

		Scanner scanner = new Scanner(System.in);
		System.out.println("This is Add Student View");
		System.out.println("Please enter the name of the student: ");
		name = scanner.nextLine();
		System.out.println("Please enter the age of the student: ");
		age = scanner.nextInt();
		System.out.println("Please enter the id of the student: ");
		id = scanner.next();
		StudentRecord.studentList.add(new Student(name, age, id));
		System.out.println("Successful!");
	}

}
