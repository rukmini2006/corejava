package rukmini.tut.inheritance.itemp;

import rukmini.tut.inheritance.Kickable;
import rukmini.tut.inheritance.Swimmable;

public final class JavaEmp extends ITEmployee implements Swimmable,Kickable {

	public JavaEmp(int empId, String name) {
		super(empId, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String tieColor(){
		return "tie color is white java tie";
		
	}
	
	public String objectOrientedConceptKnow(){
		return "very good languague";
		
	}

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println(" Iam java guy who is bad at swimming");
	}

	@Override
	public void kick() {
		System.out.println(" Iam good at kicking");
	}
}

