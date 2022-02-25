package studentSingleton;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// singleton class
public class StudentData {
	private static StudentData studentObject = new StudentData();
	
	private List<Student> studentList = new ArrayList<Student>();

	private StudentData() {
	}

	public static StudentData getStudent() {
		return studentObject;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public List<Student> getStudentList(){
		return studentList;
		
	}
}
