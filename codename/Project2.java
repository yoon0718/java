package kunsan.yoon.codename;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;
public class Project2 {
	Scanner scan = new Scanner(System.in);
	
	public void menu() {
		ArrayList<Product> pro = new ArrayList<Product>();
		while(true) {
			System.out.println("1. ��ǰ ������ �Է�\t\t\t2. ��ǰ����Ʈ ����\r\n" + 
					"3. ���� ��ǰ���� �ݾ� ����\t\t4. ��� ��ǰ ���� �ϰ� ����\r\n" + 
					"5. ���ݹ����� �˻�(���ݼ�)\t\t6. �԰�¥�� �˻�\r\n" + 
					"7. ��ǰ ����\t\t\t 8. ����\r\n");
			System.out.println("��ȣ�� �������ּ���.");
			int number = this.exception1();
			if(number == 1) {
				this.madeData(pro);
			}else if(number == 2) {
				this.watchList(pro);
			}else if(number == 3) {
				this.individualProductPriceAdjustment(pro);
			}else if(number == 4) {
				this.productPriceBatchAdjustment(pro);
			}else if(number == 5) {
				this.searchByPriceRange(pro);
			}else if(number == 6) {
				this.searchByDateOfReceipt(pro);
			}else if(number == 7) {
				this.deleteProduct(pro);
			}else if(number == 8) {
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
	public double exception3() {
		double dou;
		while(true) {
			try {
				dou = scan.nextDouble();
				break;
			}catch(InputMismatchException e) {
				scan.nextInt();
				scan.next();
				System.out.println("�ٽ��Է����ּ���");
			}
		}
		return dou;
	}
	
	public void madeData(ArrayList<Product> pro) {
		char ch;
		System.out.println("��ǰ ������?(c: CPU, r:�����, a:�����)");
		while(true) {
			ch = scan.next().charAt(0);
			if(ch == 'c' || ch == 'r' || ch == 'a') {
				break;
			}else
				System.out.println("�ٽ� �Է��ϼ���.");
		}
		System.out.println("|���λ��� �Է�|");
		System.out.println("1. ��ǰ��ȣ");
		String productId = exception2();
		System.out.println("2. �𵨸�");
		String modelName = exception2();
		System.out.println("3. ������");
		String company = exception2();
		System.out.println("4. �԰�¥(20200628)");
		int date = exception1();
		System.out.println("5. ������");
		int stock = exception1();
		System.out.println("6. ����");
		int price = exception1();
		if(ch == 'c') {
			System.out.println("7. �ӵ�");
			double speed = exception3();
			System.out.println("8. �ɼ�");
			int inch = exception1();
			pro.add(new Cpu(productId, modelName, company, date, stock, price, speed, inch));
		}else if (ch == 'r'){
			System.out.println("7. �뷮");
			int size = exception1();
			System.out.println("8. Ÿ��");
			String type = exception2();
			pro.add(new Refrigerator(productId, modelName, company, date, stock, price, size, type));
		}else if (ch == 'a') {
			System.out.println("7. �������");
			int out = exception1();
			System.out.println("8. Ʃ����������(yes/no)");
			String tuner = exception2();
			pro.add(new Audio(productId, modelName, company, date, stock, price, out, tuner));
		}
	}
	
	public void watchList(ArrayList<Product> pro) {
		System.out.println("1. ��¥��  2. ��ǰ��  3. ��ǰ�� ����  4. ���ݼ�  5. ���ݿ���");
		System.out.println("��ȣ�� �����ϼ���.");
		int number2 = this.exception1();
		if(number2 == 1) {
			System.out.println("|��¥�� ����|");
			Arraysort1 day = new Arraysort1();
			pro.sort(day);
			this.watchList2(pro);
		}else if(number2 == 2) {
			System.out.println("|��ǰ�� ����|");
			Arraysort2 name = new Arraysort2();
			pro.sort(name);
			this.watchList2(pro);
		}else if(number2 == 3) {
			System.out.println("|��ǰ�� ���� ����|");
			Arraysort3 name = new Arraysort3();
			pro.sort(name);
			this.watchList2(pro);
		}else if(number2 == 4) {
			System.out.println("|���ݼ� ����|");
			Arraysort4 price = new Arraysort4();
			pro.sort(price);
			this.watchList2(pro);
		}else if(number2 == 5) {
			System.out.println("|���ݿ��� ����|");
			Arraysort5 price = new Arraysort5();
			pro.sort(price);
			this.watchList2(pro);
		}
	}
	public void watchList2(ArrayList<Product> pro) {
		for(int i = 0; i < pro.size(); i++) {
			if(pro.get(i) != null) {
				System.out.println(i + 1 + "   ");
				pro.get(i).print();
			}
		}
	}
	public void individualProductPriceAdjustment(ArrayList<Product> pro) {
		this.watchList2(pro);
		System.out.println("���� ��ǰ ��� ���� ����");
		System.out.println("��� �����Ͻ� ��ǰ�� �������ּ���.");
		int num = exception1();
		System.out.println("���� ������ " + pro.get(num - 1).getStock() + " �Դϴ�. ���ο� ������? \r\n");
		int num2 = exception1();
		pro.get(num - 1).setStock(num2);
	}
	public void productPriceBatchAdjustment(ArrayList<Product> pro) {
		while(true) {
			System.out.println("1. ��ǰ ���� �ϰ� �ø�  2. ��ǰ ���� �ϰ� ����  3. ���\r\n ���� : ");
			int choose = exception1();
			if(choose == 1) {
				System.out.println("�ϰ� �ø� ����");
				int price = exception1();
				for(int i = 0; i < pro.size(); i++) {
					int num = pro.get(i).getPrice() + price;
					pro.get(i).setPrice(num);
				}
				break;
			}else if(choose == 2) {
				System.out.println("�ϰ� ���� ����");
				int price = exception1();
				for(int i = 0; i < pro.size(); i++) {
					int num = pro.get(i).getPrice() - price;
					pro.get(i).setPrice(num);
				}
				break;
			}else if(choose == 3) {
				System.out.println("����ϼ̽��ϴ�.");
				break;
			}else
				System.out.println("�ٽ��Է��ϼ���");
		}
	}
	public void searchByPriceRange(ArrayList<Product> pro) {
		System.out.println("�˻��� ������ ������ �Է��� �ּ���.");
		System.out.println("�ּҰ��� : ");
		int num = exception1();
		System.out.println("�ִ밡�� : ");
		int num1 = exception1();
		Arraysort4 price = new Arraysort4();
		pro.sort(price);
		for(int i = 0; i < pro.size(); i++) {
			if(num <= pro.get(i).getPrice() && pro.get(i).getPrice() <= num1) {
				System.out.println(i + 1);
				pro.get(i).print();
			}
		}
		
	}
	public void searchByDateOfReceipt(ArrayList<Product> pro) {
		System.out.println("�˻��� ��¥�� ������ �Է��� �ּ���.(�� - 20200628)");
		System.out.println("�ּҳ�¥ : ");
		int num = exception1();
		System.out.println("�ִ볯¥ : ");
		int num1 = exception1();
		Arraysort1 day = new Arraysort1();
		pro.sort(day);
		for(int i = 0; i < pro.size(); i++) {
			if(num <= pro.get(i).getDate() && pro.get(i).getDate() <= num1) {
				System.out.println(i + 1);
				pro.get(i).print();
			}
		}
	}
	
	public void deleteProduct(ArrayList<Product> pro) {
		this.watchList2(pro);
		System.out.println("������ ��ǰ�� ������ �ּ���.");
		int num = exception1();
		pro.remove(num - 1);
		System.out.println(num +"�� ��ǰ�� �����Ͽ����ϴ�.\r\n" + pro.toString());
	}
	
	public static void main(String[] args) {
		Project2 pro = new Project2();
		pro.menu();

	}

}
