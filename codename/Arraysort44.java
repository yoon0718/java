package kunsan.yoon.codename;

import java.util.Comparator;

public class Arraysort44 implements Comparator<Event>{

	@Override
	public int compare(Event a1, Event a2) {
		if(a1.getCalculation() < a2.getCalculation())
			return -1;
		if(a1.getCalculation() > a2.getCalculation())
			return 1;
		else
			return 0;
	}

}
