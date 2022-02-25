package studentState;

// student context class 
public class StudentContext {
	private State state;

	   public StudentContext(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
}
