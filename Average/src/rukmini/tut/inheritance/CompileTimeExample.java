package rukmini.tut.inheritance;

public class CompileTimeExample {
	
	
	public void  callMe(){
		System.out.println(" In callMe");
	}
	public void callMe(String name){
		System.out.println("In call me with name"+name);
	}
	public static void main(String[] args) {
		CompileTimeExample comp =new CompileTimeExample();
		comp.callMe();
		comp.callMe("rukminio");
	}

}
