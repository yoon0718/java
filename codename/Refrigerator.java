package kunsan.yoon.codename;

class Refrigerator extends Product{
	private int size;
	private String type;
	Refrigerator(String productId, String modelName, String company, int date, int stock, int price, int size, String type) {
		super(productId, modelName, company, date, stock, price);
		this.size = size;
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void getType(String type) {
		this.type = type;
	}
	void print() {
		System.out.println("제품번호 : " + this.getProductId() + "\t" + "모델명 : " + this.getModelName() + "\t" + "제조사 : " + this.getCompany() + "\t" +"입고날짜 : " 
	+ this.getDate() + "\t" +"재고수량 : " + this.getStock() + "\t" +"가격 : " + this.getPrice()
	+ "\t" +"용량 : " + this.getSize() + "\t" +"타입 : " + this.getType());
		
	}

}