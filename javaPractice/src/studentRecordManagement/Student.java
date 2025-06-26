package studentRecordManagement;

public class Student {
	String name;
	int age;
	String id;

	public Student(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// return "Student{" + "name='" + name + '\'' + ", age=" + age + ", id='" + id +
		// '\'' + '}';
		return name + ", " + age + " years old";
	}

}
