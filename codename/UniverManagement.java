package kunsan.yoon.codename;

import java.util.Scanner;

public class UniverManagement {

	public void UniverManagementStart() {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� �Է��ұ��?");
		int n = scan.nextInt();
		Project p = new Project(n);
		while(true) {
			System.out.println("1. ���� ������ ������ �Է�\r\n" + 
					"2. ���� ������ ������ ��ü ���\r\n" + 
					"3. ���� ������ ������ ���� �˻�\r\n" + 
					"4. ���� ������ ������ ����\r\n" + 
					"5. ���� ������ ������ ����\r\n" + "6. ���α׷� ����\r\n" + "��ȣ�� �Է��Ͻÿ�\r\n");
			System.out.println("��ȣ�� ���� :  ");
			int choose = scan.nextInt();
			if(choose == 1) {
				for(int i = 0; i < n; i++)
				{
					System.out.println("1 : �������� ���¸� �����ϼ���.\r\n" + 
							"1. �Ϲ��� 2. �л� 3. ������ 4. ����");
					int selection = scan.nextInt();
					switch(selection) {
					case 1: case 2: case 3: case 4:
						p.addPeople(selection);
						break;
					}
				}
			}
			else if(choose == 2) {
				p.printAllData();
			}
			else if(choose == 3) {
				p.search();
			}
			else if(choose == 4) {
				p.printAllData();
				p.change();
			}
			else if(choose == 5) {
				p.printAllData();
				p.delete();
			}
			else if(choose == 6) {
				System.out.println("���α׷��� �����մϴ�.");
				ChooseCodeName Choose = new ChooseCodeName();
				Choose.WhatNumber();
			}
		}
	}
	public static void main(String[] args) {
		UniverManagement start = new UniverManagement();
		start.UniverManagementStart();
	}

}