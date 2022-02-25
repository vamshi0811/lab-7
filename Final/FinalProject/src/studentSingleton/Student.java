package studentSingleton;

// student class
public class Student {
	private int studentId;
	private int assignment1;
	private int assignment2;
	private int assignment3;
	private String studentName;

	public Student() {

	}

	public Student(int studentId, int assignment1, int assignment2, int assignment3, String studentName) {
		this.studentId = studentId;
		this.assignment1 = assignment1;
		this.assignment2 = assignment2;
		this.assignment3 = assignment3;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getAssignment1() {
		return assignment1;
	}

	public void setAssignment1(int assignment1) {
		this.assignment1 = assignment1;
	}

	public int getAssignment2() {
		return assignment2;
	}

	public void setAssignment2(int assignment2) {
		this.assignment2 = assignment2;
	}

	public int getAssignment3() {
		return assignment3;
	}

	public void setAssignment3(int assignment3) {
		this.assignment3 = assignment3;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
