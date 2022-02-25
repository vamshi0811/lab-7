package studentState;

// concrete class implementing the same interface
public class FailStudent implements State {

	@Override
	public void studentResut(StudentContext studentContext) {
		// TODO Auto-generated method stub
		System.out.println("\tFail");
		studentContext.setState(this);
	}
	public String toString(){
	      return "Start Stop";
	   }
}
