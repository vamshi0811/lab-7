package studentProxy;

public class RealStudent implements StudentProxy{

	private String studentName;
	
	public RealStudent(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public void displayStudentDetails() {
		// TODO Auto-generated method stub
		System.out.println(studentName);
	}
	
	public void loadStudent(String studentName) {
		System.out.print("\nThe student name is ");
	}

	public String orderBread() {
		return "\nStudent result displayed...";
	}

}
