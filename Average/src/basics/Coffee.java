package basics;

public enum Coffee {
	
	SMALL(50), MEDIUM(100), LARGE(150);
	
	public int value;
	Coffee(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
		
	}
	

}
