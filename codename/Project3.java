package kunsan.yoon.codename;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Project3 {
	Scanner scan = new Scanner(System.in);
	public void testMenu() {
		ArrayList<Event> eve = new ArrayList<Event>();
		while(true) {
			System.out.println("1. 공연데이터 입력\t\t2. 공연리스트 보기\r\n" + 
		"3. 티켓금액 일괄 조정\t\t4. 개별 공연 좌석 예약\r\n" + "5. 공연제목으로 검색\t\t6.공연삭제\r\n0. 종료(메인메뉴로 돌아감)\r\n");
			System.out.println("번호를 선택하시오");
			int num = this.exception1();
			if(num == 1) {
				this.writingData(eve);
			}else if(num == 2) {
				this.sortList(eve);
			}else if(num == 3) {
				this.ticketPrice(eve);
			}else if(num == 4) {
				this.individualSeatCorrection(eve);
			}else if(num == 5) {
				this.searchEvent(eve);
			}else if(num == 6) {
				this.deleteEvent(eve);
			}else if(num == 0) {
				System.out.println("메뉴로 돌아갑니다.");
				ChooseCodeName Choose = new ChooseCodeName();
				Choose.WhatNumber();
			}
		}
	}
	public int exception1() {
		int exc;
		while(true) {
			try {
				exc = scan.nextInt();
				break;
			}catch(InputMismatchException e) {
				scan.next();
				System.out.println("다시입력해주세요");
			}
		}
		return exc;
	}
	public String exception2() {
		String chr = null;
		while(true) {
			try {
				chr = scan.next();
				break;
			}catch(InputMismatchException e) {
				scan.nextInt();
				System.out.println("다시입력해주세요");
			}
		}
		return chr;
	}
	
	public void writingData(ArrayList<Event> eve) {
		char cho;
		System.out.println("공연 종류는? (u: musical, o: 영화, p: 연극):");
		while(true) {
			cho = scan.next().charAt(0);
			if(cho == 'u' || cho == 'o' || cho == 'p') {
				break;
			}else
				System.out.println("다시 입력하세요.");
		}
		System.out.println("|세부사항 입력|");
		System.out.println("1. 공연ID");
		int id = exception1();
		System.out.println("2. 공연제목");
		String name = exception2();
		System.out.println("3. 공연날짜(ex- 20200629)");
		String date = exception2();
		System.out.println("4. 티켓금액");
		int price = exception1();
		System.out.println("5. 총좌석수");
		int seat = exception1();
		System.out.println("6. 예약된좌석수");
		int reservedSeat = exception1();
		if(cho == 'u') {
			System.out.println("7. 감독");
			String musicalDirector = exception2();
			System.out.println("8. 주연명");
			String leadName = exception2();
			System.out.println("9. 참여배우수");
			int participatingActors = exception1();
			eve.add(new Musical(id, name, date, price, seat, reservedSeat, musicalDirector, leadName, participatingActors));
		}else if(cho == 'o') {
			System.out.println("7. 감독");
			String movieDirector = exception2();
			System.out.println("8. 출연배우");
			String actors = exception2();
			eve.add(new Movie(id, name, date, price, seat, reservedSeat, movieDirector, actors));
		}else if(cho == 'p') {
			System.out.println("7. 주연배우명");
			String leadingActorName = exception2();
			System.out.println("8. 무대감독명");
			String stageDirectorName = exception2();
			eve.add(new Play(id, name, date, price, seat, reservedSeat, leadingActorName, stageDirectorName));
		}
	}
	
	public void sortList(ArrayList<Event> eve) {
		System.out.println("1) 공연제목순(기본)  2) 날짜순  3) 날짜역순  4) 잔여 좌석수순(총좌석수-예약좌석수) 5)취소 \r\n");
		System.out.println("번호를 선택하세요.\r\n");
		int cho1 = this.exception1();
		while(true) {
			if(cho1 == 1) {
				System.out.println("|공연제목순(기본)|\r\n");
				this.listNamePrint();
				Arraysort11 name = new Arraysort11();
				eve.sort(name);
				this.printList(eve);
				break;
			}else if(cho1 == 2) {
				System.out.println("|날짜순|\r\n");
				this.listNamePrint();
				Arraysort22 date = new Arraysort22();
				eve.sort(date);
				this.printList(eve);
				break;
			}else if(cho1 == 3) {
				System.out.println("|날짜역순|\r\n");
				this.listNamePrint();
				Arraysort33 date = new Arraysort33();
				eve.sort(date);
				this.printList(eve);
				break;
			}else if(cho1 == 4) {
				System.out.println("|잔여 좌석수순(총좌석수-예약좌석수)|");
				this.listNamePrint();
				Arraysort44 seat = new Arraysort44();
				eve.sort(seat);
				this.printList(eve);
				break;
			}else if(cho1 == 5) {
				System.out.println("취소를 선택하셨습니다.");
				break;
			}
		}
	}
	public void printList(ArrayList<Event> eve) {
		for(int i = 0; i < eve.size(); i++) {
			if(eve.get(i) != null) {
				System.out.println(i + 1 + "  ");
				eve.get(i).print();
			}
		}
	}
	
	public void individualSeatCorrection(ArrayList<Event> eve) {
		this.listNamePrint();
		Arraysort44 seat = new Arraysort44();
		eve.sort(seat);
		this.printList(eve);
		System.out.println("공연 번호 선택");
		int num = exception1();
		System.out.println("현재 잔여좌석수는" + eve.get(num - 1).getCalculation() + "입니다. 예약할 좌석 수는?\r\n");
		int num1 = exception1();
		eve.get(num - 1).setReservedSeat(num1);
		System.out.println("잔여 좌석수는 " + eve.get(num - 1).getCalculation() + "입니다.");
	}
	
	public void ticketPrice(ArrayList<Event> eve) {
		while(true) {
			System.out.println("1. 티켓금액 일괄 올림  2. 티켓금액 일괄 내림  3. 취소\r\n 선택 : ");
			int choose = exception1();
			if(choose == 1) {
				System.out.println("일괄 올릴 가격");
				int price = exception1();
				for(int i = 0; i < eve.size(); i++) {
					int num = eve.get(i).getPrice() + price;
					eve.get(i).setPrice(num);
				}
				break;
			}else if(choose == 2) {
				System.out.println("일괄 내릴 가격");
				int price = exception1();
				for(int i = 0; i < eve.size(); i++) {
					int num = eve.get(i).getPrice() - price;
					eve.get(i).setPrice(num);
				}
				break;
			}else if(choose == 3) {
				System.out.println("취소하셨습니다.");
				break;
			}else
				System.out.println("다시입력하세요");
		}
	}
	
	public void searchEvent(ArrayList<Event> eve) {
		System.out.println("공연제목 : ");
		String nam = exception2();
		for(int i = 0; i < eve.size(); i++) {
			if(eve.get(i).getName().equals(nam)) {
				System.out.println(i + 1 + "번");
				eve.get(i).print();
			}
		}
	}
	
	public void deleteEvent(ArrayList<Event> eve) {
		this.printList(eve);
		System.out.println("삭제할 공연을 선택해 주세요.");
		int num = exception1();
		eve.remove(num - 1);
		System.out.println("공연"+ num + "번 " + eve.get(num - 1).getName() + "를 삭제하였습니다.");
	}
	
	public void listNamePrint() {
		System.out.println("공연ID" + "\t" + "공연제목" + "\t" + "공연날짜" + "\t\t" + "공연금액" + "\t" + "총좌석수" + "\t" + "예약좌석수" + "\t" + "잔여좌석수" + "\t" + "공연별 세부사항");
	}
	
	
	public static void main(String[] args) {
		Project3 jec = new Project3();
		jec.testMenu();

	}

}
