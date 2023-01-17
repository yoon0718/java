package kunsan.yoon.codename;

import java.util.Scanner;

public class NestedLoopSample {
	public void run99Sample(int start, int end, int from, int to)
	{
		int i, j;
		for(i = start;i <= end; i++,System.out.println()) 
		{
			for(j = from;j <= to;j++,System.out.println('\t'))
			{
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
	public void DialogSample()
	{
		int start = 0, end = 0, from = 0, to = 0;
		Scanner rd = new Scanner(System.in);
		System.out.println("몇단부터 몇단까지 할까요?(int, int) :");
		start = rd.nextInt();
		end = rd.nextInt();
		System.out.println("몇부터 몇까지 곱할까요?(int, int) :");
		from = rd.nextInt();
		to = rd.nextInt();
		
		run99Sample(start, end, from, to);
	}
	
	public static void main(String[] args) {
		NestedLoopSample codef = new NestedLoopSample();
			codef.DialogSample();

	}

}
