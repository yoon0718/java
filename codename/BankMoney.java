package kunsan.yoon.codename;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BankMoney {
	public int summoney;
	public int MoneyIn(int money)
	{
		if(money < 0)
		{
			System.out.println("�Ա��� �� �� �����ϴ�. �ܰ� Ȯ���ϼ���");
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
			System.out.println("����� �� �� �����ϴ�. �ܰ� Ȯ���ϼ���");
		}
		else
		{ 
			summoney = summoney - money;
			
		}
		return summoney;
	}
	public void TotalMoney()
	{
		System.out.println("�ܰ� : " + summoney);
	}
	public void BankInOut(){
		int money;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("--------------------------------------------\r\n" + "1. ���� | 2. ��� | 3. �ܰ� | 4. ����\r\n" + "--------------------------------------------\n ��ȣ�� �Է��� �ּ���.");
			try{
				i = scan.nextInt();
				
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				BankMoney Bank = new BankMoney();
				Bank.BankInOut();
			}
			System.out.println("���� > " + i);
			
				switch(i){
				case 1:
					System.out.println("���ݾ� : ");
					money = scan.nextInt();
					MoneyIn(money);
					break;
				case 2:
					System.out.println("��ݾ� : ");
					money = scan.nextInt();
					MoneyOut(money);
					break;
				case 3:
					TotalMoney();
					break;
				case 4:
					System.out.println("���α׷� ����");
					ChooseCodeName Choose = new ChooseCodeName();
					Choose.WhatNumber();
				default:
					System.out.println("�ٽ��Է����ּ���");
					break;
				
				}
				
				
			}
			
		}
		
	

	public static void main(String[] args) {
		BankMoney Bank = new BankMoney();
		Bank.BankInOut();
		

	}

}
