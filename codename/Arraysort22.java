package kunsan.yoon.codename;

import java.util.Comparator;

public class Arraysort22 implements Comparator<Event>{

	@Override
	public int compare(Event o1, Event o2) {
		return o1.getDate().compareTo(o2.getDate());
	}
}
