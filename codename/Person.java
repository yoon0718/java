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
		System.out.println("�Ϲ��� - 1. �̸� : " + name + "\t" + "2. ������� : " + citizenNumber + "\t" +"3. ����⵵ : " + birthyear + "\t" +"4. �μ� : " + dept);
		
	}

}
