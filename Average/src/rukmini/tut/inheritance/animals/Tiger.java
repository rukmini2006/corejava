package rukmini.tut.inheritance.animals;

public class Tiger extends Animal {
	
	private String stripes;
	
	
	
	public String getStripes() {
		return stripes;
	}



	public void setStripes(String stripes) {
		this.stripes = stripes;
	}



	@Override
	public void honking() {
		System.out.println("Tiger growl ");
	}


}
