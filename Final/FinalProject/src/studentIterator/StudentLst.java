package studentIterator;

import studentSingleton.Student;
import studentSingleton.StudentData;

public class StudentLst {
	StudentData studentData;
	StudentListDetails studentListDetails;

	public StudentLst(StudentListDetails studentListDetails) {
		this.studentListDetails = studentListDetails;
	}

	public void printStudent() {
		Iterator studentIterator = studentListDetails.createIterator();
		System.out.println("\nStudents");
		printStudent(studentIterator);

	}

	private void printStudent(Iterator iterator) {
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student.getAssignment1());
			System.out.println(student.getAssignment2());
			System.out.println(student.getAssignment3());

		}
	}

}
