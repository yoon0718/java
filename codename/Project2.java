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
			System.out.println("1. 제품 데이터 입력\t\t\t2. 제품리스트 보기\r\n" + 
					"3. 개별 제품가격 금액 조정\t\t4. 모든 제품 가격 일괄 조정\r\n" + 
					"5. 가격범위로 검색(가격순)\t\t6. 입고날짜로 검색\r\n" + 
					"7. 제품 삭제\t\t\t 8. 종료\r\n");
			System.out.println("번호를 선택해주세요.");
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
	public double exception3() {
		double dou;
		while(true) {
			try {
				dou = scan.nextDouble();
				break;
			}catch(InputMismatchException e) {
				scan.nextInt();
				scan.next();
				System.out.println("다시입력해주세요");
			}
		}
		return dou;
	}
	
	public void madeData(ArrayList<Product> pro) {
		char ch;
		System.out.println("제품 종류는?(c: CPU, r:냉장고, a:오디오)");
		while(true) {
			ch = scan.next().charAt(0);
			if(ch == 'c' || ch == 'r' || ch == 'a') {
				break;
			}else
				System.out.println("다시 입력하세요.");
		}
		System.out.println("|세부사항 입력|");
		System.out.println("1. 제품번호");
		String productId = exception2();
		System.out.println("2. 모델명");
		String modelName = exception2();
		System.out.println("3. 제조사");
		String company = exception2();
		System.out.println("4. 입고날짜(20200628)");
		int date = exception1();
		System.out.println("5. 재고수량");
		int stock = exception1();
		System.out.println("6. 가격");
		int price = exception1();
		if(ch == 'c') {
			System.out.println("7. 속도");
			double speed = exception3();
			System.out.println("8. 핀수");
			int inch = exception1();
			pro.add(new Cpu(productId, modelName, company, date, stock, price, speed, inch));
		}else if (ch == 'r'){
			System.out.println("7. 용량");
			int size = exception1();
			System.out.println("8. 타입");
			String type = exception2();
			pro.add(new Refrigerator(productId, modelName, company, date, stock, price, size, type));
		}else if (ch == 'a') {
			System.out.println("7. 앰프출력");
			int out = exception1();
			System.out.println("8. 튜너지원여부(yes/no)");
			String tuner = exception2();
			pro.add(new Audio(productId, modelName, company, date, stock, price, out, tuner));
		}
	}
	
	public void watchList(ArrayList<Product> pro) {
		System.out.println("1. 날짜순  2. 제품명  3. 제품명 역순  4. 가격순  5. 가격역순");
		System.out.println("번호를 선택하세요.");
		int number2 = this.exception1();
		if(number2 == 1) {
			System.out.println("|날짜순 정렬|");
			Arraysort1 day = new Arraysort1();
			pro.sort(day);
			this.watchList2(pro);
		}else if(number2 == 2) {
			System.out.println("|제품명 정렬|");
			Arraysort2 name = new Arraysort2();
			pro.sort(name);
			this.watchList2(pro);
		}else if(number2 == 3) {
			System.out.println("|제품명 역순 정렬|");
			Arraysort3 name = new Arraysort3();
			pro.sort(name);
			this.watchList2(pro);
		}else if(number2 == 4) {
			System.out.println("|가격순 정렬|");
			Arraysort4 price = new Arraysort4();
			pro.sort(price);
			this.watchList2(pro);
		}else if(number2 == 5) {
			System.out.println("|가격역순 정렬|");
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
		System.out.println("개별 제품 재고 수량 수정");
		System.out.println("재고를 변경하실 제품을 선택해주세요.");
		int num = exception1();
		System.out.println("현재 재고수는 " + pro.get(num - 1).getStock() + " 입니다. 새로운 재고수는? \r\n");
		int num2 = exception1();
		pro.get(num - 1).setStock(num2);
	}
	public void productPriceBatchAdjustment(ArrayList<Product> pro) {
		while(true) {
			System.out.println("1. 제품 가격 일괄 올림  2. 제품 가격 일괄 내림  3. 취소\r\n 선택 : ");
			int choose = exception1();
			if(choose == 1) {
				System.out.println("일괄 올릴 가격");
				int price = exception1();
				for(int i = 0; i < pro.size(); i++) {
					int num = pro.get(i).getPrice() + price;
					pro.get(i).setPrice(num);
				}
				break;
			}else if(choose == 2) {
				System.out.println("일괄 내릴 가격");
				int price = exception1();
				for(int i = 0; i < pro.size(); i++) {
					int num = pro.get(i).getPrice() - price;
					pro.get(i).setPrice(num);
				}
				break;
			}else if(choose == 3) {
				System.out.println("취소하셨습니다.");
				break;
			}else
				System.out.println("다시입력하세요");
		}
	}
	public void searchByPriceRange(ArrayList<Product> pro) {
		System.out.println("검색할 가격의 범위를 입력해 주세요.");
		System.out.println("최소가격 : ");
		int num = exception1();
		System.out.println("최대가격 : ");
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
		System.out.println("검색할 날짜의 범위를 입력해 주세요.(예 - 20200628)");
		System.out.println("최소날짜 : ");
		int num = exception1();
		System.out.println("최대날짜 : ");
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
		System.out.println("삭제할 제품을 선택해 주세요.");
		int num = exception1();
		pro.remove(num - 1);
		System.out.println(num +"번 제품을 삭제하였습니다.\r\n" + pro.toString());
	}
	
	public static void main(String[] args) {
		Project2 pro = new Project2();
		pro.menu();

	}

}
