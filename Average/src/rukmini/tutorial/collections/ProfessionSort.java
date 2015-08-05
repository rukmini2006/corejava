package rukmini.tutorial.collections;

import java.util.Comparator;

public class ProfessionSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String prof1 = ((Person)o1).getprofession();
		Person p2 =((Person)o2);
	
		String prof2 =p2.getprofession();
		return (prof1).compareTo(prof2);
	
	}

	
}
