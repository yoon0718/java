package kunsan.yoon.codename;


class Cpu extends Product{
	private double speed;
	private int inch;
	Cpu(String productId, String modelName, String company, int date, int stock, int price, double speed, int inch) {
		super(productId, modelName, company, date, stock, price);
		this.speed = speed;
		this.inch = inch;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	void print() {
		System.out.println("��ǰ��ȣ : " + this.getProductId() + "\t" + "�𵨸� : " + this.getModelName() + "\t" + "������ : " + this.getCompany() + "\t" +"�԰�¥ : " 
	+ this.getDate() + "\t" +"������ : " + this.getStock() + "\t" +"���� : " + this.getPrice()
	+ "\t" +"�ӵ� : " + this.getSpeed() + "\t" +"�ɼ� : " + this.getInch());
		
	}
	

}