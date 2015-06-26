package rukmini.tut.classes.innerclass;

import rukmini.tut.classes.innerclass.House.HousePainter;

public class InnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculation calc = new Calculation();
		House house  =new House("bag");
		System.out.println(house.name);
		
		HousePainter hp = house.new HousePainter("black");
		HousePainter hp1 = new House("rukmini").new HousePainter("blue");
		hp1.painter();
		
		System.out.println(hp);
		System.out.println(hp1);

	}

}
