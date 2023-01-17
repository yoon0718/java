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
		System.out.println("제품번호 : " + this.getProductId() + "\t" + "모델명 : " + this.getModelName() + "\t" + "제조사 : " + this.getCompany() + "\t" +"입고날짜 : " 
	+ this.getDate() + "\t" +"재고수량 : " + this.getStock() + "\t" +"가격 : " + this.getPrice()
	+ "\t" +"속도 : " + this.getSpeed() + "\t" +"핀수 : " + this.getInch());
		
	}
	

}