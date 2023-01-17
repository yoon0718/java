package kunsan.yoon.codename;

class Person {
	String name;
	int citizenNumber;
	int birthyear;
	String dept;
	Person(String name, int citizenNumber, int birthyear, String dept){
		this.name = name;
		this.citizenNumber = citizenNumber;
		this.birthyear = birthyear;
		this.dept = dept;
	}
	
	
	public void print() {
		System.out.println("일반인 - 1. 이름 : " + name + "\t" + "2. 생년월일 : " + citizenNumber + "\t" +"3. 출생년도 : " + birthyear + "\t" +"4. 부서 : " + dept);
		
	}

}
