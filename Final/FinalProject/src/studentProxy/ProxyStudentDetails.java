package studentProxy;

public class ProxyStudentDetails implements StudentProxy {

	private String studentName;
	private RealStudent realStudent;

	public ProxyStudentDetails(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public void displayStudentDetails() {
		// TODO Auto-generated method stub
		if (realStudent == null) {
			realStudent = new RealStudent(studentName);

		}
		realStudent.displayStudentDetails();
	}

}
