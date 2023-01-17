package kunsan.yoon.codename;

public class NestedLoop {
	public void run99()
	{
		int i, j;
		for(i = 1;i < 10;i++,System.out.println())
		{
			for(j = 1;j < 10;j++,System.out.println('\t'))
			{
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
	public static void main(String[] args) {
		NestedLoop codee = new NestedLoop();
			codee.run99();

	}

}
