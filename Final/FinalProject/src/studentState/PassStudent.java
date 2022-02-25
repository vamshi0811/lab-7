package studentState;

//concrete class implementing the same interface

public class PassStudent implements State {

	@Override
	public void studentResut(StudentContext studentContext) {
		// TODO Auto-generated method stub
		System.out.println("\tPass");
		studentContext.setState(this);
	}

	public String toString() {
		return "Start State";
	}
}
