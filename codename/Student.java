package kunsan.yoon.codename;

class Student extends Person {
	int studentNumber;
	Student(String name, int citizenNumber, int birthyear, String dept, int studentNumber) {
		super(name, citizenNumber, birthyear, dept);
		this.studentNumber = studentNumber;
	}
	
	public void print() {
		System.out.println("학생 - 1. 이름 : " + name + "\t" + "2. 생년월일 : " + citizenNumber + "\t" +"3. 출생년도 : " + birthyear + "\t" +"4. 부서 : " + dept
				+ "\t" + "5. 학번 : " + studentNumber);
		
	}

}