package kunsan.yoon.codename;

import java.util.Scanner;

class Project {

	private Person[] persons;
	private int numOfPeople;
	Scanner scan = new Scanner(System.in);
	public  Project(int num) {
		persons = new Person[num];
		numOfPeople = 0;
	}
	
	private void AddPeopleInfo(Person p) {
		persons[numOfPeople++] = p;
	}
	public void addPeople(int choice) {
		int citizenNumber, birthyear, studentNumber, employeeNumber;
		String name, dept, position;
		
		
		if(choice == 1) {
			System.out.println("�̸� : ");
			name = scan.next();
			System.out.println("������� : 6�ڸ� ");
			citizenNumber = scan.nextInt();
			System.out.println("����⵵ : 4�ڸ� ");
			birthyear = scan.nextInt();
			System.out.println("�Ҽ� : ");
			dept = scan.next();
			AddPeopleInfo(new Person(name, citizenNumber, birthyear, dept));
		}else if (choice == 2) {
			System.out.println("�̸� : ");
			name = scan.next();
			System.out.println("������� : 6�ڸ� ");
			citizenNumber = scan.nextInt();
			System.out.println("����⵵ : 4�ڸ� ");
			birthyear = scan.nextInt();
			System.out.println("�Ҽ� : ");
			dept = scan.next();
			System.out.println("�й� : ");
			studentNumber = scan.nextInt();
			AddPeopleInfo(new Student(name, citizenNumber, birthyear, dept, studentNumber));
		}else if (choice == 3) {
			System.out.println("�̸� : ");
			name = scan.next();
			System.out.println("������� : 6�ڸ� ");
			citizenNumber = scan.nextInt();
			System.out.println("����⵵ : 4�ڸ� ");
			birthyear = scan.nextInt();
			System.out.println("�Ҽ� : ");
			dept = scan.next();
			System.out.println("������ȣ : ");
			employeeNumber = scan.nextInt();
			AddPeopleInfo(new Researcher(name, citizenNumber, birthyear, dept, employeeNumber));
		}else if (choice == 4) {
			System.out.println("�̸� : ");
			name = scan.next();
			System.out.println("������� : 6�ڸ� ");
			citizenNumber = scan.nextInt();
			System.out.println("����⵵ : 4�ڸ� ");
			birthyear = scan.nextInt();
			System.out.println("�Ҽ� : ");
			dept = scan.next();
			System.out.println("������ȣ : ");
			employeeNumber = scan.nextInt();
			System.out.println("��å : ");
			position = scan.next();
			AddPeopleInfo(new Professor(name, citizenNumber, birthyear, dept, employeeNumber, position));
		}
		System.out.println("�Է¿Ϸ�");
	}
	
	public void printAllData() {
		for(int i = 0; i < numOfPeople; i++) {
			System.out.println(i+1 + ")");
			persons[i].print();
			System.out.println(" ");
		}
	}
	
	public void search() {
		System.out.println("ã�� ����� �������ּ���.\r\n1. �̸��˻�   2. ���̰˻�\r\n");
		int n = scan.nextInt();
		if( n == 1 ) {
			System.out.println("ã������ �ο��� �̸��� �Է��Ͻÿ�.\r\n");
			String name2 = scan.next();
			for(int i = 0; i < numOfPeople; i++) {
				if(name2.equals(persons[i].name)) {
					persons[i].print();
					break;
				}
				
			}
		}
		else if( n == 2 ) {
			System.out.println("ã������ �ο��� ���̸� �Է��Ͻÿ�.\r\n");
			int age = scan.nextInt();
			age = 2021 - age;
				for(int i = 0; i < numOfPeople; i++) {
					if(persons[i].birthyear == age) {
						persons[i].print();
						break;
					}
				}	
		}
	}
	public void delete() {
		System.out.println("������ �ο��� ���ڸ� �Է��Ͻÿ�.");
		int n = scan.nextInt();
		for(int i=0; i < numOfPeople; i++){
		    if(persons[i] == persons[n-1]){
		        for(int k=i; k < numOfPeople-1; k++){
		    	   persons[k] = persons[k+1];
		        }
		        numOfPeople --;
		    break;
		    }
		}

		
	}
	
	public void change() {
		int citizenNumber, birthyear, studentNumber, employeeNumber;
		String name, dept, position;
		System.out.println("�����Ͻ� �ο��� ��ȣ�� �������ּ���");
		int n = scan.nextInt();
		System.out.println("�������� �ٽ� �������ּ���.\r\n" + 
				"1. �Ϲ��� 2. �л� 3. ������ 4. ����");
		int choice = scan.nextInt();
		if(choice == 1) {
			System.out.println("�̸� : ");
			name = scan.next();
			System.out.println("������� : 6�ڸ� ");
			citizenNumber = scan.nextInt();
			System.out.println("����⵵ : 4�ڸ� ");
			birthyear = scan.nextInt();
			System.out.println("�Ҽ� : ");
			dept = scan.next();
			persons[n - 1] = new Person(name, citizenNumber, birthyear, dept);
		}else if (choice == 2) {
			System.out.println("�̸� : ");
			name = scan.next();
			System.out.println("������� : 6�ڸ� ");
			citizenNumber = scan.nextInt();
			System.out.println("����⵵ : 4�ڸ� ");
			birthyear = scan.nextInt();
			System.out.println("�Ҽ� : ");
			dept = scan.next();
			System.out.println("�й� : ");
			studentNumber = scan.nextInt();
			persons[n - 1] = new Student(name, citizenNumber, birthyear, dept, studentNumber);
		}else if (choice == 3) {
			System.out.println("�̸� : ");
			name = scan.next();
			System.out.println("������� : 6�ڸ� ");
			citizenNumber = scan.nextInt();
			System.out.println("����⵵ : 4�ڸ� ");
			birthyear = scan.nextInt();
			System.out.println("�Ҽ� : ");
			dept = scan.next();
			System.out.println("������ȣ : ");
			employeeNumber = scan.nextInt();
			persons[n - 1] = new Researcher(name, citizenNumber, birthyear, dept, employeeNumber);
		}else if (choice == 4) {
			System.out.println("�̸� : ");
			name = scan.next();
			System.out.println("������� : 6�ڸ� ");
			citizenNumber = scan.nextInt();
			System.out.println("����⵵ : 4�ڸ� ");
			birthyear = scan.nextInt();
			System.out.println("�Ҽ� : ");
			dept = scan.next();
			System.out.println("������ȣ : ");
			employeeNumber = scan.nextInt();
			System.out.println("��å : ");
			position = scan.next();
			persons[n - 1] = new Professor(name, citizenNumber, birthyear, dept, employeeNumber, position);
		}
	}

}
