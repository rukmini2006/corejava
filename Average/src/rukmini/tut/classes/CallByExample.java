package rukmini.tut.classes;

//In case  of primitive type (call by value) if we change the value that changed 
//value will not be reflected

//In case of reference types(call by reference)  if we change the value of the reference
//the changed value will be reflected

public class CallByExample {
	

	public static void main(String[] args) {
		CallByExample cbe = new CallByExample();
		/*int val = 3;
		cbe.print(val);
		System.out.println(" FinalValue is: " +val);
		*/
		Student stud = new Student("jay",5);
		stud.setGrade(6);
		System.out.println("Before 1 "+stud.getGrade());
		cbe.printStudentInfo(stud);
		System.out.println("After 1 : "+stud.getGrade());

	}
	
	/*public void print(int a){
		System.out.println("Before  " +a);
		a = 100;
		System.out.println("After "+a);
	}*/
	
	public void printStudentInfo(Student stud){
		System.out.println("Before   is :"+stud.getGrade());
		stud.setGrade(4);
	}
}
