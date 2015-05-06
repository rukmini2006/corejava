import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		Integer i1=new Integer(10);
		Integer i2=new Integer(20);
		Integer i3=new Integer(30);
		Integer i4=new Integer(50);
		System.out.println(al);
		System.out.println(al.size());
		al.add(i1);
		al.add(i2);
		System.out.println(al);
		System.out.println(al.size());
		al.add(i3);
		al.add(i4);
		al.add("rukmini");
		System.out.println(al);
		System.out.println(al.size());
		al.remove(3);
		System.out.println(al);
		System.out.println(al.size());
		
		Object a=al.clone();
		System.out.println(a);
		System.out.println(al);
		System.out.println(al.size());
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		
	}

}
