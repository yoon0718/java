package kunsan.yoon.codename;
import java.util.Comparator;

public class Arraysort1 implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getDate() < o2.getDate())
			return -1;
		if(o1.getDate() > o2.getDate())
			return 1;
		else
			return 0;
	}
}
