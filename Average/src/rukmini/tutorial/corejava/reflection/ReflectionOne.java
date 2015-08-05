package rukmini.tutorial.corejava.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import rukmini.tutorial.collections.Person;


public class ReflectionOne {
	public String name;
	public String place;
	
	public void callMe(){
		System.out.println("This is reflectionOne :CallMe Method ");
		
	}
	public void callMe(String name){
		System.out.println("This is reflection one method "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //  printObjectDetails();
		//Person per = new Person();
		//Class perClass = per.getClass();
	//	Class classObj ="hello".getClass();
		//System.out.println(classObj);
		//System.out.println(classObj.getName());
		
		Class classObj =String.class;
	//	String str = new String("Hello");
		//classObj =
		try {
			classObj= Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(classObj);
		Class superClassObj = classObj.getSuperclass();
		System.out.println("superclass "+superClassObj);
		
	classObj = Person.class;
		System.out.println(" Fields=====================");
		Field[] fields = classObj.getFields();
		for(int i =0;i<fields.length;i++){
			System.out.println(fields[i]);
		}
		
		System.out.println(" Methods==========");
		Method[] methods= classObj.getMethods();
		for(Method method:methods){
			System.out.println(method);
			
		}
		System.out.println(" Interfaces=======");
		Class[] interfaces = classObj.getInterfaces();
		for(int i=0;i<interfaces.length;i++){
			System.out.println("Interfaces of string class are as follows:"+interfaces[i]);
		}
		
		System.out.println("Constructors ====");
		Constructor[] con = classObj.getConstructors();
		for(Constructor ctor:con){
			Class<?>[] pType =ctor.getParameterTypes();
		
		}
		System.out.println(con);
		
    
	}
public static void printObjectDetails(Object obj) {
	//Class classClass = 
	//String name ="rukmini";
	
	
}
}
