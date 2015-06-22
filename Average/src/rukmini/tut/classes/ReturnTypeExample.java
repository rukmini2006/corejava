package rukmini.tut.classes;

public class ReturnTypeExample {
	int value;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ReturnTypeExample rte = new ReturnTypeExample();
		//int d;
		rte.setInitialValue(9);
		rte.doCalculation(3,5);
		rte.doCalculation(4, 5,7);
		
		
		String dou = rte.add(4, 6) + " ";
		
		
	}
	
	public String getName(String firstName,String lastName){
		return firstName + " ******"+ lastName;
		
	}

	public int add(int i, int j) {
		// System.out.println(i+j);
		return (i + j);
	}
	
	public float add(int i,int j,int k){
		return (float) (i+j+k);
		
	}
	

	public void doCalculation(int a,int b) {
		//ReturnTypeExample rte = new ReturnTypeExample();

		int finalValue = value - add(a,b);
		System.out.println(finalValue);
	}
	
	
	public void doCalculation(int a,int b,int c) {
		//ReturnTypeExample rte = new ReturnTypeExample();

		
		float finalValue = value - add(a,b,c);
		System.out.println(finalValue);
	}

	public  void setInitialValue(int val) {
		this.value = val;
	}

	

}
