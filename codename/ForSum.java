package kunsan.yoon.codename;
import java.lang.NumberFormatException;
import java.util.Scanner;
public class ForSum {
	public void printSum(int start, int end)
	{
		int sum = 0;
		
		for(int i = start;i<= end; i++)
		{
			sum += i;
			System.out.println(i);
			if(i<end)
			{
				System.out.println("+");
			}
			else
			{
				System.out.println("=");
				System.out.println(sum);
			}
		}
	}
	public void Dialog()
	{
		int start = 0, end = 0;
		Scanner rd = new Scanner(System.in);
		System.out.println("����� ����� ���ұ��?(int, int) :");
		try{
			start = rd.nextInt();
			end = rd.nextInt();
		}
		catch(NumberFormatException e) {
			System.out.println("�������� �Է��� �ֽñ� �ٶ��ϴ�.\nó���� ���ư��ϴ�.");
			ForSum coded = new ForSum();
			coded.Dialog();
		}
		
		
		printSum(start, end);
	}
	
	public static void main(String[] args) {
		ForSum coded = new ForSum();
			coded.Dialog();
	}

}
