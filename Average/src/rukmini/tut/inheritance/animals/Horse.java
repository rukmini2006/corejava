package rukmini.tut.inheritance.animals;

public class Horse extends Animal {
	
	private String tail;
	
	
	
	public String getTail() {
		return tail;
	}



	public void setTail(String tail) {
		this.tail = tail;
	}



	@Override
	public void honking() {
		System.out.println("Horse honks as neigh ");
	}

}
