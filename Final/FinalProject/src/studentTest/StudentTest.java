package studentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import studentProxy.RealStudent;
import studentSingleton.Student;
import studentSingleton.StudentData;
import studentState.FailStudent;
import studentState.PassStudent;

// unit test class 
public class StudentTest {

	@Test
	public void testStudentSingleton() {
		StudentData object = StudentData.getStudent();
		object.addStudent(new Student(2, 50, 60, 70, "Jack"));
		assertEquals("Jack", object.getStudentList().get(0).getStudentName());
	}

	@Test
	public void testStudentState() {
		PassStudent pass = new PassStudent();
		assertEquals("Start State", pass.toString());
	}
	
	@Test
	public void testStudentStop() {
		FailStudent fail = new FailStudent();
		assertEquals("Start Stop", fail.toString());
	}
	
	@Test
	public void testStudentProxy() {
		RealStudent realStudent = new RealStudent(null);
		assertEquals("\nStudent result displayed...", realStudent.orderBread());
	}
	
	
}
