package kunsan.yoon.codename;

import java.util.Comparator;

public class Arraysort33 implements Comparator<Event>{

	@Override
	public int compare(Event o1, Event o2) {
		return o2.getDate().compareTo(o1.getDate());
	}
}
