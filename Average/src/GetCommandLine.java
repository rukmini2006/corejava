
public class GetCommandLine {

	public static void main(String[] args) {
		System.out.println("----------->Getting command line arguments -- ");
		for(int i=0;i<args.length;i++){
			System.out.println("Argument["+(i+1)+"] is" +args[i]);
		}
	}

}
