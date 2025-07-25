package itemManagementMicroSystem;

public class Item {
	String code, name, price;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Item(String code, String name, String price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		// return "Student{" + "name='" + name + '\'' + ", age=" + age + ", id='" + id +
		// '\'' + '}';
		return "Item code: " + code + " | Name: " + name + " | Price: " + price;
	}

}
