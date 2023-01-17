package kunsan.yoon.codename;

import java.util.Scanner;
public class CoffeePrice {
	public void calcPrice()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("무슨 커피를 드릴까요?");
		String order = scanner.next();
		int price = 0;
		switch (order)
		{
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 원하시는 메뉴가 없습니다.");				
		}
		if(price != 0)
			System.out.println(order + "는" + price + "원입니다.");
	}
	public static void main(String[] args) {
		
		CoffeePrice codea = new CoffeePrice();
				codea.calcPrice();
	}

}
