package rukmini.tut.classes;

public class ReturnTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypeExample rte = new ReturnTypeExample();
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

		int finalValue = 8 - add(a,b);
		System.out.println(finalValue);
	}
	
	
	public void doCalculation(int a,int b,int c) {
		//ReturnTypeExample rte = new ReturnTypeExample();

		
		float finalValue = 8- add(a,b,c);
		System.out.println(finalValue);
	}

	

}
