package studentRecordManagement;

public class ViewAllStudents implements Guide {

	@Override
	public void showDashBoard() {
		System.out.println("This is View All Students View");
		System.out.println(StudentRecord.studentList);
		if (StudentRecord.studentList.isEmpty()) {
			System.out.println("No students found.");
		} else {
			for (Student s : StudentRecord.studentList) {
				System.out.println(s);
			}
		}

	}

}
