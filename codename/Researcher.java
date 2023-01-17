package kunsan.yoon.codename;

class Researcher extends Person {
	int employeeNumber;

	Researcher(String name, int citizenNumber, int birthyear, String dept, int employeeNumber) {
		super(name, citizenNumber, birthyear, dept);
		this.employeeNumber = employeeNumber;
		
	}
	public void print() {
		System.out.println("연구원 - 1. 이름 : " + name + "\t" + "2. 생년월일 : " + citizenNumber + "\t" +"3. 출생년도 : " + birthyear + "\t" +"4. 부서 : " + dept
				+ "\t" + "5. 직원번호 : " + employeeNumber);
	}

}