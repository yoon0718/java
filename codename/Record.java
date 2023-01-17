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
		System.out.println(student + "�� �л��� ������" + intArray[student-1] + "�Դϴ�.\n" );
		return intArray;
	}
	public int[] HighDown(int[] intArray)
	{
		int[] sortedArr = null;
		sortedArr = intArray.clone();
		Arrays.sort(sortedArr);
		System.out.println("�������� : "+ sortedArr[0]);
		System.out.println("�ְ����� : "+ sortedArr[sortedArr.length - 1]);
		return sortedArr;
	}
	public int[] Average(int[] intArray)
	{
		float sum = 0;
		for(int k : intArray)
		{
			sum += k;
		}
		System.out.println("��� ���� : " + sum/intArray.length);
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
			System.out.println("������ : " + result );
		}
		else
		{
			int m = size / 2;
			result = sortedArr[m];
			System.out.println("������ : " + result);
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
			System.out.println("<�л� ���� ó�� ���α׷�>\r\n" + "1)  �л� ���� �Է�\r\n" + "2)  �л� ��ü ���� ����Ʈ ����\r\n" + 
					"3)  �л��� ��ȣ�� ���� ����\r\n" + "4)  ���� �ְ� ����, ���� ���� ����\r\n" + "5)  ���� ��� ����, ������ ���� ����\r\n" + 
					"6)  ���� �����ؼ� ����\r\n" + "0)  ���� �޴��� ���ư�(����)");
			try{
				i = scan.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				Record re = new Record();
				re.RecordInOut();
			}
			System.out.println("���� > " + i);
			
				switch(i){
				case 1:
					System.out.println("�л� ���� �Է�\n����� �л��� ������ �Է��Ͻðڽ��ϱ�?");
					student = scan.nextInt();
					intArray = new int[student];
					System.out.println("������ �Է����ּ���.");
					for(i = 0; i < student; i++){
						System.out.println(i + 1 + ")  ");
						intArray[i] = scan.nextInt();
					}
					break;
				case 2:
					System.out.println("��ü �л� ���� ����Ʈ ����");
					result = AllRecord(intArray);
					break;
				case 3:
					System.out.println("�˻��� �л��� ��ȣ�� �Է��ϼ���");
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
		Record re = new Record();
		re.RecordInOut();
		

	}

}
