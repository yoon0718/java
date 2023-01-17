package kunsan.yoon.codename;

public class DoWhileSample {
	public void printAtoZ()
	{
		char a = 'a';
		
		do
		{
			System.out.println(a);
			a = (char) (a + 1);
		}
		while (a <= 'z');
		
	}
	public static void main(String[] args) {
		DoWhileSample codec = new DoWhileSample();
			codec.printAtoZ();

	}

}
