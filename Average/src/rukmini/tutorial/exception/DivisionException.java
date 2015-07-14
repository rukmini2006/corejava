package rukmini.tutorial.exception;

public class DivisionException  extends Exception{
	private String message;
	public DivisionException(String message){
		this.message = message;
	}
	

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "user defined exception" +message;
}
}
