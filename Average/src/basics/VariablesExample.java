package basics;

import rukmini.tut.classes.Student;

public class VariablesExample {
	
	 //String name = "rukmini";
	

	public static void main(String[] args) {
		Student stud = new Student("ruk",8);
		//System.out.println(stud.getName());
	//	stud.count = 8;
		//System.out.println(stud.count);
		//System.out.println(stud.count);
		//System.out.println(stud.getTeacher());
		
		Student  stud2 = new Student("rukmini", 455);
		/*System.out.println(stud2.getName());
		stud2.count = 9;
		System.out.println(stud2.count);
		
		System.out.println(stud.count);*/
		Student stud3 = new Student("girish", 6) ;
		Student stud4 = new Student("baba",666);
		System.out.println(Student.count);
		VariablesExample.callMe();
	}
	
	public static void callMe(){
		
	}
	
}
