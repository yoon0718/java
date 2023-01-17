package kunsan.yoon.codename;

import java.util.Comparator;

public class Arraysort11 implements Comparator<Event>{

	@Override
	public int compare(Event a1, Event a2) {
		return a1.getName().compareTo(a2.getName());
		
	}
	
}