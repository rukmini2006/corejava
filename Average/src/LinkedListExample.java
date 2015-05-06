import java.util.LinkedList;


public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Object> link=new LinkedList<Object>();
		link.add("a");
		link.add("b");
		link.add(new Integer(10));
		System.out.println(link);
		System.out.println(link.size());
		link.addFirst(new Integer(20));
		System.out.println(link);
		System.out.println(link.size());
		link.addLast("rukmini");
		System.out.println(link);
		System.out.println(link.size());
		link.add(1, "prakash");
		System.out.println(link);
		System.out.println(link.size());
		link.add(6, 5);
		System.out.println(link);
		System.out.println(link.size());
		link.remove(3);
		System.out.println(link);
		System.out.println(link.size());

	}

}
