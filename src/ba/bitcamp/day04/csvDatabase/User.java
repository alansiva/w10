package ba.bitcamp.day04.csvDatabase;

public class User {

	private String name;
	private String lastName;
	private int age;
	private boolean driverLicence;

	public User(String name, String lastName, int age, boolean driverLicence) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.driverLicence = driverLicence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDriverLicence() {
		return driverLicence;
	}

	public void setDriverLicence(boolean driverLicence) {
		this.driverLicence = driverLicence;
	}

	public String toCSVString(String delimeter) {
		StringBuilder sb = new StringBuilder();

		sb.append(name).append(delimeter).append(lastName).append(delimeter)
				.append(age).append(delimeter).append(driverLicence);

		return sb.toString();

	}


}
