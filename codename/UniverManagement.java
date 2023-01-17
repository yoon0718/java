package kunsan.yoon.codename;

import java.util.Scanner;

public class UniverManagement {

	public void UniverManagementStart() {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇명을 입력할까요?");
		int n = scan.nextInt();
		Project p = new Project(n);
		while(true) {
			System.out.println("1. 대학 구성원 데이터 입력\r\n" + 
					"2. 대학 구성원 데이터 전체 출력\r\n" + 
					"3. 대학 구성원 데이터 조건 검색\r\n" + 
					"4. 대학 구성원 데이터 변경\r\n" + 
					"5. 대학 구성원 데이터 삭제\r\n" + "6. 프로그램 종료\r\n" + "번호를 입력하시오\r\n");
			System.out.println("번호를 선택 :  ");
			int choose = scan.nextInt();
			if(choose == 1) {
				for(int i = 0; i < n; i++)
				{
					System.out.println("1 : 구성원의 형태를 선택하세요.\r\n" + 
							"1. 일반인 2. 학생 3. 연구원 4. 교수");
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
				System.out.println("프로그램을 종료합니다.");
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