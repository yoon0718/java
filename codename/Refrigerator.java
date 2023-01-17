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
		System.out.println("��ǰ��ȣ : " + this.getProductId() + "\t" + "�𵨸� : " + this.getModelName() + "\t" + "������ : " + this.getCompany() + "\t" +"�԰�¥ : " 
	+ this.getDate() + "\t" +"������ : " + this.getStock() + "\t" +"���� : " + this.getPrice()
	+ "\t" +"�뷮 : " + this.getSize() + "\t" +"Ÿ�� : " + this.getType());
		
	}

}