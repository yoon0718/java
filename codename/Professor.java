package kunsan.yoon.codename;

class Professor extends Researcher {
	String position;

	Professor(String name, int citizenNumber, int birthyear, String dept, int employeeNumber, String position) {
		super(name, citizenNumber, birthyear, dept, employeeNumber);
		this.position = position;
		
	}
	public void print() {
		System.out.println("���� - 1. �̸� : " + name + "\t" + "2. ������� : " + citizenNumber + "\t" +"3. ����⵵ : " + birthyear + "\t" +"4. �μ� : " + dept
				+ "\t" + "5. ������ȣ : " + employeeNumber + "\t" + "6. ��å : " + position);
		
	}

}
