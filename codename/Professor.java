package kunsan.yoon.codename;

class Professor extends Researcher {
	String position;

	Professor(String name, int citizenNumber, int birthyear, String dept, int employeeNumber, String position) {
		super(name, citizenNumber, birthyear, dept, employeeNumber);
		this.position = position;
		
	}
	public void print() {
		System.out.println("교수 - 1. 이름 : " + name + "\t" + "2. 생년월일 : " + citizenNumber + "\t" +"3. 출생년도 : " + birthyear + "\t" +"4. 부서 : " + dept
				+ "\t" + "5. 직원번호 : " + employeeNumber + "\t" + "6. 직책 : " + position);
		
	}

}
