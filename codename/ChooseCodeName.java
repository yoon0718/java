package kunsan.yoon.codename;
 
import java.util.InputMismatchException;
import java.util.Scanner;
public class ChooseCodeName 
{
	public void ChooseSwitch(int number)
	{
			
				switch(number)
				{
				case 1:
					CoffeePrice codea = new CoffeePrice();
					codea.calcPrice();
					break ;
				case 2:
					WhileSample codeb = new WhileSample();
					codeb.getAverage();
					break ;
				case 3:
					DoWhileSample codec = new DoWhileSample();
					codec.printAtoZ();
					break ;
				case 4:
					ForSum coded = new ForSum();
					coded.Dialog();
					break ;
				case 5:
					NestedLoop codee = new NestedLoop();
					codee.run99();
					break ;
				case 6:
					NestedLoopSample codef = new NestedLoopSample();
					codef.DialogSample();
					break ;
				case 7:
					BankMoney Bank = new BankMoney();
					Bank.BankInOut();
				case 8:
					Record re = new Record();
					re.RecordInOut();
				case 9:
					UniverManagement start = new UniverManagement();
					start.UniverManagementStart();
				case 10:
					Project2 pro = new Project2();
					pro.menu();
				case 11:
					Project3 jec = new Project3();
					jec.testMenu();
				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
				default:
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					break ;
				}
				
				ChooseCodeName Choose = new ChooseCodeName();
				Choose.WhatNumber();
	}
	
	
	public void WhatNumber()
	{
		int number = 0 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("o ������ ���α׷��� �߿��� ������ �Լ��� �����ϼ���.\r\n" + "1)Ŀ�� �޴��� ������ ������ ����� �ִ� ���α׷�\r\n" + 
				"2)�Էµ� ���� ��հ� ���� ���ϱ��ؼ� ȭ�鿡 ����Ʈ�ϱ�\r\n" + "3)���ĺ� A���� Z���� ����Ʈ�ϱ�\r\n" + 
				"4)���� x�� y�� �Է¹޾�, x���� y���� ���ϴ� ������ ��� ���̱�\r\n" + "5)99�� �ܼ� ���\r\n" + 
				"6)99�� ��´ܼ��� ���� ���� �����ؼ� ����Ʈ�ϱ�\r\n" + "7)���� ���α׷�\r\n" + "8)����ó�� ���α׷�\r\n" + "9)�����η�DB���α׷�\r\n"
				+ "10)��ǰ�������α׷�\r\n" + "11)�����������α׷�\r\n"+"0)����\r\n");
		try{
			number = scan.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
			ChooseCodeName Choose = new ChooseCodeName();
			Choose.WhatNumber();
		}
		System.out.println("���� : ---" + number + "---");
		ChooseSwitch(number);
	}
	public static void main(String[] args) {
		ChooseCodeName Choose = new ChooseCodeName();
			Choose.WhatNumber();

	}

}
