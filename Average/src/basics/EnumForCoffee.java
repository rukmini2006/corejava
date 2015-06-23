package basics;

public class EnumForCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		EnumForCoffee.orderCoffee(Coffee.SMALL);
		EnumForCoffee.orderCoffee(Coffee.MEDIUM);
		EnumForCoffee.orderCoffee(Coffee.LARGE);
	}
	
	public static void orderCoffee(Coffee coffee){
		if(coffee == Coffee.SMALL){
			System.out.println("Small "+(20+coffee.getValue()));
			
		}else if(coffee ==Coffee.MEDIUM){
			System.out.println("Medium "+(40+coffee.getValue()));
		}
			else if(coffee ==Coffee.LARGE){
				System.out.println("large "+(60+coffee.getValue()));
			}
			
			
		}
		
	}

