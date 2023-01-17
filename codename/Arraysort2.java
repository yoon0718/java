package kunsan.yoon.codename;
import java.util.Comparator;

public class Arraysort2 implements Comparator<Product>{

	@Override
	public int compare(Product a1, Product a2) {
		return a1.getModelName().compareTo(a2.getModelName());
		
	}
	
}
