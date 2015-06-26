package rukmini.tut.classes.innerclass;

public class House {
	
	String name = "y ";
	public House(String name){
		this.name = name;
	}
	
     public class HousePainter{
    	 String color;
    	 public HousePainter(String color){
    		 this.color = color;
    	 }
    	 public void painter() {
    		 System.out.println(" Iam painting  " +name +"  House with  "+color+ "  color");
    	 }
     }
	
	public void paint() {
		
	}
	
}
