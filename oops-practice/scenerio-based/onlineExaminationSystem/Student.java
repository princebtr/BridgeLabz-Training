package onlineExaminationSystem;

public class Student {
	private int rollNo;
	private String name;
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getRoll() {
		return rollNo;
	}
}
