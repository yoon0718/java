package kunsan.yoon.codename;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Record {
	public int student;
	Scanner scan = new Scanner(System.in);
	
	public int[] AllRecord(int[] intArray)
	{
		
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.println(i + 1 + ")  " + intArray[i]);
		}
		return intArray;
		
	}
	public int[] ChooseStudent(int[] intArray)
	{
		System.out.println(student + "번 학생의 성적은" + intArray[student-1] + "입니다.\n" );
		return intArray;
	}
	public int[] HighDown(int[] intArray)
	{
		int[] sortedArr = null;
		sortedArr = intArray.clone();
		Arrays.sort(sortedArr);
		System.out.println("최저점수 : "+ sortedArr[0]);
		System.out.println("최고점수 : "+ sortedArr[sortedArr.length - 1]);
		return sortedArr;
	}
	public int[] Average(int[] intArray)
	{
		float sum = 0;
		for(int k : intArray)
		{
			sum += k;
		}
		System.out.println("평균 점수 : " + sum/intArray.length);
		int[] sortedArr = null;
		sortedArr = intArray.clone();
		Arrays.sort(sortedArr);
		int size = sortedArr.length;
		float result;
		if(size % 2 == 0)
		{
			int m = size / 2;
			int n = size / 2 - 1;
			result = (float)(sortedArr[m] + sortedArr[n])/2;
			System.out.println("중위값 : " + result );
		}
		else
		{
			int m = size / 2;
			result = sortedArr[m];
			System.out.println("중위값 : " + result);
		}
		return sortedArr;
		
	}
	public int[] ArrSort(int[] intArray)
	{
		int[] Another = null;
		Another = intArray.clone();
		Arrays.sort(Another);
		for(int i = 0; i < student; i++) {
			System.out.println(i + 1 + ") " + Another[i]);
		}
		return Another;
	}
	
	public void RecordInOut(){
		int i = 0;
		int[] intArray = null;
		int[] result = null;
		while(true) {
			System.out.println("<학생 성적 처리 프로그램>\r\n" + "1)  학생 성적 입력\r\n" + "2)  학생 전체 성적 리스트 보기\r\n" + 
					"3)  학생의 번호로 성적 보기\r\n" + "4)  성적 최고 점수, 최저 점수 보기\r\n" + "5)  성적 평균 점수, 중위값 점수 보기\r\n" + 
					"6)  성적 정렬해서 보기\r\n" + "0)  메인 메뉴로 돌아감(종료)");
			try{
				i = scan.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				Record re = new Record();
				re.RecordInOut();
			}
			System.out.println("선택 > " + i);
			
				switch(i){
				case 1:
					System.out.println("학생 성적 입력\n몇명의 학생의 성적을 입력하시겠습니까?");
					student = scan.nextInt();
					intArray = new int[student];
					System.out.println("성적을 입력해주세요.");
					for(i = 0; i < student; i++){
						System.out.println(i + 1 + ")  ");
						intArray[i] = scan.nextInt();
					}
					break;
				case 2:
					System.out.println("전체 학생 성적 리스트 보기");
					result = AllRecord(intArray);
					break;
				case 3:
					System.out.println("검색할 학생의 번호를 입력하세요");
					student = scan.nextInt();
					result = ChooseStudent(intArray);
					break;
				case 4:
					result = HighDown(intArray);
					break;
				case 5:
					result = Average(intArray);
					break;
				case 6:	
					result = ArrSort(intArray);
					break;
				case 0:
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
		Record re = new Record();
		re.RecordInOut();
		

	}

}
