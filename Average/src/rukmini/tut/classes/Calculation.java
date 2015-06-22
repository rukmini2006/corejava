package rukmini.tut.classes;

public class Calculation {
	int value;
	public int add(int i, int j) {
		// System.out.println(i+j);
		return (i + j);
	}
	//In method overloading the returntype can be diffeerent but the objective is 
	//method name should be same and parameters should be different 
	public double add(int i, int j,int k,int l) {
		// System.out.println(i+j);
		return (i + j+k);
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
