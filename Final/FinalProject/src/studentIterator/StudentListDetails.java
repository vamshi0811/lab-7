package studentIterator;

import java.util.List;

import studentSingleton.Student;
import studentSingleton.StudentData;

public class StudentListDetails {

	Student[] student;

	public Iterator createIterator() {
		StudentData studentData = StudentData.getStudent();
		List<Student> studentList = studentData.getStudentList();
		student = new Student[studentList.size()];
		for (int i = 0; i < studentList.size(); i++) {
			student[i] = studentList.get(i);
		}
		return new StudentIterator(student);

	}
}
