package kunsan.yoon.codename;
import java.util.Comparator;

public class Arraysort3 implements Comparator<Product>{

	@Override
	public int compare(Product a1, Product a2) {
		return a2.getModelName().compareTo(a1.getModelName());
	}

}