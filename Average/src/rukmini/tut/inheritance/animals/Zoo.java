package rukmini.tut.inheritance.animals;

public class Zoo {

	public static void main(String[] args) {
		
		Horse horse = new Horse();
		System.out.println(horse.getBreed());
		
		horse.honking();
		System.out.println( horse.getTail());;
	
		
		
		Tiger tiger =new Tiger();
		System.out.println(tiger.getSize());
		tiger.honking();



	}

}
