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
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				default:
					System.out.println("잘못입력하셨습니다.");
					break ;
				}
				
				ChooseCodeName Choose = new ChooseCodeName();
				Choose.WhatNumber();
	}
	
	
	public void WhatNumber()
	{
		int number = 0 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("o 다음의 프로그램들 중에서 수행할 함수를 선택하세요.\r\n" + "1)커피 메뉴를 넣으면 가격을 출력해 주는 프로그램\r\n" + 
				"2)입력된 수의 평균과 갯수 구하기해서 화면에 프린트하기\r\n" + "3)알파벳 A부터 Z까지 프린트하기\r\n" + 
				"4)정수 x와 y를 입력받아, x부터 y까지 더하는 과정과 결과 보이기\r\n" + "5)99단 단순 찍기\r\n" + 
				"6)99단 출력단수와 수의 범위 설정해서 프린트하기\r\n" + "7)은행 프로그램\r\n" + "8)성적처리 프로그램\r\n" + "9)대학인력DB프로그램\r\n"
				+ "10)제품관리프로그램\r\n" + "11)공연관리프로그램\r\n"+"0)종료\r\n");
		try{
			number = scan.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("정수가 아닙니다. 다시 입력하세요!");
			ChooseCodeName Choose = new ChooseCodeName();
			Choose.WhatNumber();
		}
		System.out.println("선택 : ---" + number + "---");
		ChooseSwitch(number);
	}
	public static void main(String[] args) {
		ChooseCodeName Choose = new ChooseCodeName();
			Choose.WhatNumber();

	}

}
