package basics;

public class LoopExample {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * String names[] = {"baby","balu","charan","devi"};
		 * 
		 * System.out.println("====For loop==== "); for(int
		 * i=0;i<names.length;i++){ System.out.println(names[i]); }
		 * System.out.println("===Enhanced Forloop "); for(String name : names){
		 * System.out.println(name); } System.out.println(" =====WHILE"); int
		 * idxWhile = 0; while(idxWhile < names.length){
		 * System.out.println(names[idxWhile++]);
		 * 
		 * } System.out.println("====DO WHILE==== "); int idxDoWhile = 0; do{
		 * System.out.println(names[idxDoWhile++]);
		 * }while(idxDoWhile<names.length);
		 */

		int folksIdx = 0;
		// for (;;)
		// while(true)
		// do{
		// System.out.println("Hello Folks " + folksIdx++);
		// }while(true);
		/**
		 * IF  u want to have for loop to run infinite times then use for(; ;)
		 */
		while (true) {
			System.out.println("helloFolks  " + folksIdx++);
			if (folksIdx == 3000) {
				break;
			}
		}
			System.out.println("Hello guys ");
		}
	}

