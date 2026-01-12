package flight;

public class User {
//	private static List<User> userList;
	private String name;
	private int age;
	private int noOfPassenger;
	public User(String name, int age) {
//		userList = new ArrayList<>();
		this.name = name;
		this.age = age;
//		this.noOfPassenger = noOfPassenger;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public int getNoOfPassenger() {
		return noOfPassenger;
	}
}
