package basics;

public class PerFormanceTestOnSwitchAndIfElse {

	public static void main(String[] args) {
		int age = 14;
		String name = (age > 18) ? "Adult" : "Child";
		
		// System.out.println(name);
		long startTime, endTime = 0;
		
		 startTime = System.nanoTime();
	//	System.out.println("====using if else==== ");
		 for(int i=0;i<500000;i++){
			 if (age == 10) {
					name = "10";
				} 
				else if (age == 11 ) {
					name = "11";
				}
				else if (age == 12 ) {
					name = "12";
				}
				else if (age == 13 ) {
					name = "13";
				}
				else if (age == 14 ) {
					name = "14";
				}
				else if (age == 15 ) {
					name = "15";
				}
				else if (age == 16 ) {
					name = "16";
				}else if (age == 17 ) {
					name = "17";
				} else if (age == 18) {
					name = "18";
				}
				else if (age == 19 ) {
					name = "19";
				}
				else if (age == 20 ) {
					name = "20";
				}else {
					name = "no name";
				}
		 }
		
		endTime =System.nanoTime();
		
		System.out.println("If-Else Performance time is: "+(endTime-startTime));
		
		//System.out.println(name);
		//System.out.println("====using if ==== ");
		
//		if (age == 18)
//		{
//			name = "18";
//		}  if (age == 19 )
//		{
//			name = "19";
//		}  if (age == 21)
//		{
//			name = "21";
//		} else
//		{
//			name = "no name";
//		}
		//System.out.println(name);
		
		//System.out.println("====Using Switch Case===== ");
		startTime = System.nanoTime();
		
		for(int i=0;i<500000;i++){
			switch (age) {
			case 10:
				name ="10";
				break;
			case 11:
				name ="11";
				break;
			case 12:
				name ="12";
				break;
			case 13:
				name ="13";
				break;
			case 14:
				name ="14";
				break;
			case 15:
				name ="15";
				break;
			case 16:
				name ="16";
				break;
			case 17:
				name ="17";
				break;
			case 18:
				name ="18";
				break;
			case 19:
				name ="19";
				break;
			case 20:
				name ="20";
				break;

			default:
				System.out.println("No Age ");
				break;
			}
		}
		
		endTime = System.nanoTime();
		
		System.out.println("SwitchCase Performance is :  "+(endTime-startTime));
		
		
	}

}
