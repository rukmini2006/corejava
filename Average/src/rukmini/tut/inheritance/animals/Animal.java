package rukmini.tut.inheritance.animals;

public class Animal {
	
	private int size;
	private String breed;
	private String color;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void honking(){
		System.out.println("Both honk in different ways");
	}
	

}
