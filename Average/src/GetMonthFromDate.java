import java.text.SimpleDateFormat;
import java.util.Date;


public class GetMonthFromDate {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(" date is : "+date);
		SimpleDateFormat sdf=new SimpleDateFormat("MM");
		System.out.println("Month is "+sdf.format(date));
		

	}

}
