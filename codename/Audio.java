package kunsan.yoon.codename;


class Audio extends Product{
	private int out;
	private String tuner;
	Audio(String productId, String modelName, String company, int date, int stock, int price, int out, String tuner) {
		super(productId, modelName, company, date, stock, price);
		this.out = out;
		this.tuner = tuner;
	}
	public int getOut() {
		return out;
	}
	public void setOut(int out) {
		this.out = out;
	}
	public String getTuner() {
		return tuner;
	}
	public void setTuner(String tuner) {
		this.tuner = tuner;
	}
	void print() {
		System.out.println("��ǰ��ȣ : " + this.getProductId() + "\t" + "�𵨸� : " + this.getModelName() + "\t" + "������ : " + this.getCompany() + "\t" +"�԰�¥ : " 
	+ this.getDate() + "\t" +"������ : " + this.getStock() + "\t" +"���� : " + this.getPrice()
	+ "\t" +"������� : " + this.getOut() + "\t" +"Ʃ���������� : " + this.getTuner());
		
	}

}
