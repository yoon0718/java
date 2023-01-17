package kunsan.yoon.codename;
import java.util.Comparator;

public class Arraysort4 implements Comparator<Product>{

	@Override
	public int compare(Product a1, Product a2) {
		if(a1.getPrice() < a2.getPrice())
			return -1;
		if(a1.getPrice() > a2.getPrice())
			return 1;
		else
			return 0;
	}

}
