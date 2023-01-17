package kunsan.yoon.codename;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Project3 {
	Scanner scan = new Scanner(System.in);
	public void testMenu() {
		ArrayList<Event> eve = new ArrayList<Event>();
		while(true) {
			System.out.println("1. ���������� �Է�\t\t2. ��������Ʈ ����\r\n" + 
		"3. Ƽ�ϱݾ� �ϰ� ����\t\t4. ���� ���� �¼� ����\r\n" + "5. ������������ �˻�\t\t6.��������\r\n0. ����(���θ޴��� ���ư�)\r\n");
			System.out.println("��ȣ�� �����Ͻÿ�");
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
				System.out.println("�޴��� ���ư��ϴ�.");
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
				System.out.println("�ٽ��Է����ּ���");
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
				System.out.println("�ٽ��Է����ּ���");
			}
		}
		return chr;
	}
	
	public void writingData(ArrayList<Event> eve) {
		char cho;
		System.out.println("���� ������? (u: musical, o: ��ȭ, p: ����):");
		while(true) {
			cho = scan.next().charAt(0);
			if(cho == 'u' || cho == 'o' || cho == 'p') {
				break;
			}else
				System.out.println("�ٽ� �Է��ϼ���.");
		}
		System.out.println("|���λ��� �Է�|");
		System.out.println("1. ����ID");
		int id = exception1();
		System.out.println("2. ��������");
		String name = exception2();
		System.out.println("3. ������¥(ex- 20200629)");
		String date = exception2();
		System.out.println("4. Ƽ�ϱݾ�");
		int price = exception1();
		System.out.println("5. ���¼���");
		int seat = exception1();
		System.out.println("6. ������¼���");
		int reservedSeat = exception1();
		if(cho == 'u') {
			System.out.println("7. ����");
			String musicalDirector = exception2();
			System.out.println("8. �ֿ���");
			String leadName = exception2();
			System.out.println("9. ��������");
			int participatingActors = exception1();
			eve.add(new Musical(id, name, date, price, seat, reservedSeat, musicalDirector, leadName, participatingActors));
		}else if(cho == 'o') {
			System.out.println("7. ����");
			String movieDirector = exception2();
			System.out.println("8. �⿬���");
			String actors = exception2();
			eve.add(new Movie(id, name, date, price, seat, reservedSeat, movieDirector, actors));
		}else if(cho == 'p') {
			System.out.println("7. �ֿ�����");
			String leadingActorName = exception2();
			System.out.println("8. ���밨����");
			String stageDirectorName = exception2();
			eve.add(new Play(id, name, date, price, seat, reservedSeat, leadingActorName, stageDirectorName));
		}
	}
	
	public void sortList(ArrayList<Event> eve) {
		System.out.println("1) ���������(�⺻)  2) ��¥��  3) ��¥����  4) �ܿ� �¼�����(���¼���-�����¼���) 5)��� \r\n");
		System.out.println("��ȣ�� �����ϼ���.\r\n");
		int cho1 = this.exception1();
		while(true) {
			if(cho1 == 1) {
				System.out.println("|���������(�⺻)|\r\n");
				this.listNamePrint();
				Arraysort11 name = new Arraysort11();
				eve.sort(name);
				this.printList(eve);
				break;
			}else if(cho1 == 2) {
				System.out.println("|��¥��|\r\n");
				this.listNamePrint();
				Arraysort22 date = new Arraysort22();
				eve.sort(date);
				this.printList(eve);
				break;
			}else if(cho1 == 3) {
				System.out.println("|��¥����|\r\n");
				this.listNamePrint();
				Arraysort33 date = new Arraysort33();
				eve.sort(date);
				this.printList(eve);
				break;
			}else if(cho1 == 4) {
				System.out.println("|�ܿ� �¼�����(���¼���-�����¼���)|");
				this.listNamePrint();
				Arraysort44 seat = new Arraysort44();
				eve.sort(seat);
				this.printList(eve);
				break;
			}else if(cho1 == 5) {
				System.out.println("��Ҹ� �����ϼ̽��ϴ�.");
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
		System.out.println("���� ��ȣ ����");
		int num = exception1();
		System.out.println("���� �ܿ��¼�����" + eve.get(num - 1).getCalculation() + "�Դϴ�. ������ �¼� ����?\r\n");
		int num1 = exception1();
		eve.get(num - 1).setReservedSeat(num1);
		System.out.println("�ܿ� �¼����� " + eve.get(num - 1).getCalculation() + "�Դϴ�.");
	}
	
	public void ticketPrice(ArrayList<Event> eve) {
		while(true) {
			System.out.println("1. Ƽ�ϱݾ� �ϰ� �ø�  2. Ƽ�ϱݾ� �ϰ� ����  3. ���\r\n ���� : ");
			int choose = exception1();
			if(choose == 1) {
				System.out.println("�ϰ� �ø� ����");
				int price = exception1();
				for(int i = 0; i < eve.size(); i++) {
					int num = eve.get(i).getPrice() + price;
					eve.get(i).setPrice(num);
				}
				break;
			}else if(choose == 2) {
				System.out.println("�ϰ� ���� ����");
				int price = exception1();
				for(int i = 0; i < eve.size(); i++) {
					int num = eve.get(i).getPrice() - price;
					eve.get(i).setPrice(num);
				}
				break;
			}else if(choose == 3) {
				System.out.println("����ϼ̽��ϴ�.");
				break;
			}else
				System.out.println("�ٽ��Է��ϼ���");
		}
	}
	
	public void searchEvent(ArrayList<Event> eve) {
		System.out.println("�������� : ");
		String nam = exception2();
		for(int i = 0; i < eve.size(); i++) {
			if(eve.get(i).getName().equals(nam)) {
				System.out.println(i + 1 + "��");
				eve.get(i).print();
			}
		}
	}
	
	public void deleteEvent(ArrayList<Event> eve) {
		this.printList(eve);
		System.out.println("������ ������ ������ �ּ���.");
		int num = exception1();
		eve.remove(num - 1);
		System.out.println("����"+ num + "�� " + eve.get(num - 1).getName() + "�� �����Ͽ����ϴ�.");
	}
	
	public void listNamePrint() {
		System.out.println("����ID" + "\t" + "��������" + "\t" + "������¥" + "\t\t" + "�����ݾ�" + "\t" + "���¼���" + "\t" + "�����¼���" + "\t" + "�ܿ��¼���" + "\t" + "������ ���λ���");
	}
	
	
	public static void main(String[] args) {
		Project3 jec = new Project3();
		jec.testMenu();

	}

}
