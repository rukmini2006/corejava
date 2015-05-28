package rukmini.tut.classes;

import rukmini.tutur.classes.Teacher;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 =  new Student();
		st1.name = "Rukmini";
		st1.rollNo = 1;
		st1.grade = 2;
		st1.height = 5;
		
		Teacher t2 = new Teacher();
		t2.setSalary(10000);
		t2.setName("baba");
		System.out.println(t2.getName());
		System.out.println(t2.getSalary());

	}

}
