
import java.util.Scanner;

import studentIterator.StudentListDetails;
import studentIterator.StudentLst;
import studentProxy.ProxyStudentDetails;
import studentProxy.StudentProxy;
import studentSingleton.Student;
import studentSingleton.StudentData;
import studentState.FailStudent;
import studentState.PassStudent;
import studentState.StudentContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("!!! Student performence/ analytics !!!");

		StudentData object = StudentData.getStudent();

		int choice, studentId, assignment1 = 0, assignment2 = 0, assignment3 = 0;
		String studentName = null;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out
					.println("\n1. Add Student \n2. View Student \n3. View assignment marks \n4. View Grade \n5. Exit");
			System.out.println("\nEnter your choice: ");
			choice = in.nextInt();
			if (choice == 1) {
				System.out.println("\nStudent ID: ");
				studentId = in.nextInt();
				System.out.println("Student Name: ");
				studentName = in.next();
				System.out.println("Assignment 1: ");
				assignment1 = in.nextInt();
				System.out.println("Assignment 2: ");
				assignment2 = in.nextInt();
				System.out.println("Assignment 3: ");
				assignment3 = in.nextInt();

				object.addStudent(new Student(studentId, assignment1, assignment2, assignment3, studentName));
				System.out.println("Student added...");
				StudentContext studentContext = new StudentContext();

				if (assignment1 > 50 && assignment2 > 50 && assignment3 > 50) {
					PassStudent pass = new PassStudent();
					pass.studentResut(studentContext);
					System.out.println(studentContext.getState().toString());
				} else if (assignment1 < 50 || assignment2 < 50 || assignment3 < 50) {
					FailStudent fail = new FailStudent();
					fail.studentResut(studentContext);
					System.out.println(studentContext.getState().toString());
				}
			} else if (choice == 2) {
				System.out.println("\nStudent Details: ");
				System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Student ID", "Student Name", "Assignment 1",
						"Assignment 2", "Assignment 3");
				for (Student student : object.getStudentList()) {
					System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", student.getStudentId(), student.getStudentName(),
							student.getAssignment1(), student.getAssignment2(), student.getAssignment3());
				}
			} else if (choice == 3) {
				StudentListDetails studentListDetails = new StudentListDetails();
				StudentLst students = new StudentLst(studentListDetails);
				students.printStudent();
				System.out.println("\n");
			} else if (choice == 4) {
				System.out.println("\nStudent Result: ");
				float total = (assignment1 + assignment2 + assignment3);
				float avg = (total / 3);
				System.out.println(avg);
				for (Student student : object.getStudentList()) {
					StudentProxy studentProxy = new ProxyStudentDetails(student.getStudentName());
					studentProxy.displayStudentDetails();
					if (avg >= 90 && avg <= 100) {
						System.out.println("Grade A");
					} else if (avg >= 80 && avg < 90) {
						System.out.println("Grade B");
					} else if (avg >= 70 && avg < 80) {
						System.out.println("Grade C");
					} else if (avg >= 60 && avg < 70) {
						System.out.println("Grade D");
					} else if (avg >= 50 && avg < 60) {
						System.out.println("Grade E");
					} else if (avg < 50) {
						System.out.println("Grade F");
					}
				}
			} else if (choice == 5) {
				System.out.println("Thank You...");
				break;
			} else {
				System.out.println("Invalid choice");
			}
		}
	}

}
