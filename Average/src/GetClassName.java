import java.math.BigDecimal;
import java.util.Calendar;


public class GetClassName {

	public static void main(String[] args) {
		Class cl=String.class;
		System.out.println("Class Name is:  "+cl.getName());
		cl=Object.class;
		System.out.println("Class Name is: " +cl.getName());
		cl=Calendar.class;
		System.out.println(" class name is: "+cl.getName());
		cl=BigDecimal.class;
		System.out.println("class name is:  "+cl.getName());
	}

}
