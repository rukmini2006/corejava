package rukmini.tut.classes.innerclass;

import rukmini.tut.classes.innerclass.House.HousePainter;

public class InnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculation calc = new Calculation();
		House house  =new House();
		System.out.println(house.name);
		
		HousePainter hp = house.new HousePainter();
		HousePainter hp1 = new House().new HousePainter();

	}

}
