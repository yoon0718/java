package kunsan.yoon.codename;

class Researcher extends Person {
	int employeeNumber;

	Researcher(String name, int citizenNumber, int birthyear, String dept, int employeeNumber) {
		super(name, citizenNumber, birthyear, dept);
		this.employeeNumber = employeeNumber;
		
	}
	public void print() {
		System.out.println("������ - 1. �̸� : " + name + "\t" + "2. ������� : " + citizenNumber + "\t" +"3. ����⵵ : " + birthyear + "\t" +"4. �μ� : " + dept
				+ "\t" + "5. ������ȣ : " + employeeNumber);
	}

}