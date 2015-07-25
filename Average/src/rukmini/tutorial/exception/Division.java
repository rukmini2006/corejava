package rukmini.tutorial.exception;

public class Division {
	/*public static int divideValues(int a,int b) throws DivisionException{
		if(b==0){
			throw new DivisionException("U have passes zero as second argument");
		}
		try {
			int div = a/b;
			
		} catch (Exception e)  {
			if(b==0)
				throw new DivisionException("U have passes zero as second argument");
			e.printStackTrace();
		}
		int div = 0;
		return div;
		
	}*/
	public static int divideValues(int a,int b) throws Exception{
		if(b==0){
			throw new DivisionException("u have passed zero as second argument");
			
		}
		int div = a/b;
		return div;
		
	}
	
	

}
class subDivision extends Division{
		
	}
