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
			System.out.println("이름 : ");
			name = scan.next();
			System.out.println("생년월일 : 6자리 ");
			citizenNumber = scan.nextInt();
			System.out.println("출생년도 : 4자리 ");
			birthyear = scan.nextInt();
			System.out.println("소속 : ");
			dept = scan.next();
			AddPeopleInfo(new Person(name, citizenNumber, birthyear, dept));
		}else if (choice == 2) {
			System.out.println("이름 : ");
			name = scan.next();
			System.out.println("생년월일 : 6자리 ");
			citizenNumber = scan.nextInt();
			System.out.println("출생년도 : 4자리 ");
			birthyear = scan.nextInt();
			System.out.println("소속 : ");
			dept = scan.next();
			System.out.println("학번 : ");
			studentNumber = scan.nextInt();
			AddPeopleInfo(new Student(name, citizenNumber, birthyear, dept, studentNumber));
		}else if (choice == 3) {
			System.out.println("이름 : ");
			name = scan.next();
			System.out.println("생년월일 : 6자리 ");
			citizenNumber = scan.nextInt();
			System.out.println("출생년도 : 4자리 ");
			birthyear = scan.nextInt();
			System.out.println("소속 : ");
			dept = scan.next();
			System.out.println("직원번호 : ");
			employeeNumber = scan.nextInt();
			AddPeopleInfo(new Researcher(name, citizenNumber, birthyear, dept, employeeNumber));
		}else if (choice == 4) {
			System.out.println("이름 : ");
			name = scan.next();
			System.out.println("생년월일 : 6자리 ");
			citizenNumber = scan.nextInt();
			System.out.println("출생년도 : 4자리 ");
			birthyear = scan.nextInt();
			System.out.println("소속 : ");
			dept = scan.next();
			System.out.println("직원번호 : ");
			employeeNumber = scan.nextInt();
			System.out.println("직책 : ");
			position = scan.next();
			AddPeopleInfo(new Professor(name, citizenNumber, birthyear, dept, employeeNumber, position));
		}
		System.out.println("입력완료");
	}
	
	public void printAllData() {
		for(int i = 0; i < numOfPeople; i++) {
			System.out.println(i+1 + ")");
			persons[i].print();
			System.out.println(" ");
		}
	}
	
	public void search() {
		System.out.println("찾을 방법을 선택해주세요.\r\n1. 이름검색   2. 나이검색\r\n");
		int n = scan.nextInt();
		if( n == 1 ) {
			System.out.println("찾으려는 인원의 이름을 입력하시오.\r\n");
			String name2 = scan.next();
			for(int i = 0; i < numOfPeople; i++) {
				if(name2.equals(persons[i].name)) {
					persons[i].print();
					break;
				}
				
			}
		}
		else if( n == 2 ) {
			System.out.println("찾으려는 인원의 나이를 입력하시오.\r\n");
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
		System.out.println("삭제할 인원의 숫자를 입력하시오.");
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
		System.out.println("변경하실 인원의 번호를 선택해주세요");
		int n = scan.nextInt();
		System.out.println("구성원을 다시 선택해주세요.\r\n" + 
				"1. 일반인 2. 학생 3. 연구원 4. 교수");
		int choice = scan.nextInt();
		if(choice == 1) {
			System.out.println("이름 : ");
			name = scan.next();
			System.out.println("생년월일 : 6자리 ");
			citizenNumber = scan.nextInt();
			System.out.println("출생년도 : 4자리 ");
			birthyear = scan.nextInt();
			System.out.println("소속 : ");
			dept = scan.next();
			persons[n - 1] = new Person(name, citizenNumber, birthyear, dept);
		}else if (choice == 2) {
			System.out.println("이름 : ");
			name = scan.next();
			System.out.println("생년월일 : 6자리 ");
			citizenNumber = scan.nextInt();
			System.out.println("출생년도 : 4자리 ");
			birthyear = scan.nextInt();
			System.out.println("소속 : ");
			dept = scan.next();
			System.out.println("학번 : ");
			studentNumber = scan.nextInt();
			persons[n - 1] = new Student(name, citizenNumber, birthyear, dept, studentNumber);
		}else if (choice == 3) {
			System.out.println("이름 : ");
			name = scan.next();
			System.out.println("생년월일 : 6자리 ");
			citizenNumber = scan.nextInt();
			System.out.println("출생년도 : 4자리 ");
			birthyear = scan.nextInt();
			System.out.println("소속 : ");
			dept = scan.next();
			System.out.println("직원번호 : ");
			employeeNumber = scan.nextInt();
			persons[n - 1] = new Researcher(name, citizenNumber, birthyear, dept, employeeNumber);
		}else if (choice == 4) {
			System.out.println("이름 : ");
			name = scan.next();
			System.out.println("생년월일 : 6자리 ");
			citizenNumber = scan.nextInt();
			System.out.println("출생년도 : 4자리 ");
			birthyear = scan.nextInt();
			System.out.println("소속 : ");
			dept = scan.next();
			System.out.println("직원번호 : ");
			employeeNumber = scan.nextInt();
			System.out.println("직책 : ");
			position = scan.next();
			persons[n - 1] = new Professor(name, citizenNumber, birthyear, dept, employeeNumber, position);
		}
	}

}
