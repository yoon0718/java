package kunsan.yoon.codename;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BankMoney {
	public int summoney;
	public int MoneyIn(int money)
	{
		if(money < 0)
		{
			System.out.println("입금을 할 수 없습니다. 잔고를 확인하세요");
		}
		else
		{ 
			summoney += money;
			
		}
		return summoney;
	}
	public int MoneyOut(int money)
	{
		if(summoney < money)
		{
			System.out.println("출금을 할 수 없습니다. 잔고를 확인하세요");
		}
		else
		{ 
			summoney = summoney - money;
			
		}
		return summoney;
	}
	public void TotalMoney()
	{
		System.out.println("잔고 : " + summoney);
	}
	public void BankInOut(){
		int money;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("--------------------------------------------\r\n" + "1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료\r\n" + "--------------------------------------------\n 번호를 입력해 주세요.");
			try{
				i = scan.nextInt();
				
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				BankMoney Bank = new BankMoney();
				Bank.BankInOut();
			}
			System.out.println("선택 > " + i);
			
				switch(i){
				case 1:
					System.out.println("예금액 : ");
					money = scan.nextInt();
					MoneyIn(money);
					break;
				case 2:
					System.out.println("출금액 : ");
					money = scan.nextInt();
					MoneyOut(money);
					break;
				case 3:
					TotalMoney();
					break;
				case 4:
					System.out.println("프로그램 종료");
					ChooseCodeName Choose = new ChooseCodeName();
					Choose.WhatNumber();
				default:
					System.out.println("다시입력해주세요");
					break;
				
				}
				
				
			}
			
		}
		
	

	public static void main(String[] args) {
		BankMoney Bank = new BankMoney();
		Bank.BankInOut();
		

	}

}
