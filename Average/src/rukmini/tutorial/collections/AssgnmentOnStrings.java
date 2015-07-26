package rukmini.tutorial.collections;

public class AssgnmentOnStrings {

	public static void main(String[] args) {
		
	String fruits[] = new String[4];
	fruits[0] = "One";
	fruits[1] = "Two";
	fruits[2] = "Three";
	fruits[3] = "Four";
	
	String fruitNews[] = new String[10];
	//int index = fruits.length;
	int index = fruitNews.length-1;
	
	for(int i = 0; i<fruits.length;i++){
		fruitNews[i] = fruits[i];
		
	}
	//	fruitNews[index] = "Five";
	//	fruitNews[index+1] = "Six";
	fruitNews[index] = "seven";
		
		for(String g:fruitNews){
		
			System.out.println(g);
		
	}
	
	}
	}



