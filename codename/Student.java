package kunsan.yoon.codename;

class Student extends Person {
	int studentNumber;
	Student(String name, int citizenNumber, int birthyear, String dept, int studentNumber) {
		super(name, citizenNumber, birthyear, dept);
		this.studentNumber = studentNumber;
	}
	
	public void print() {
		System.out.println("�л� - 1. �̸� : " + name + "\t" + "2. ������� : " + citizenNumber + "\t" +"3. ����⵵ : " + birthyear + "\t" +"4. �μ� : " + dept
				+ "\t" + "5. �й� : " + studentNumber);
		
	}

}