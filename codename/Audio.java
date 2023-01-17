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
		System.out.println("제품번호 : " + this.getProductId() + "\t" + "모델명 : " + this.getModelName() + "\t" + "제조사 : " + this.getCompany() + "\t" +"입고날짜 : " 
	+ this.getDate() + "\t" +"재고수량 : " + this.getStock() + "\t" +"가격 : " + this.getPrice()
	+ "\t" +"앰프출력 : " + this.getOut() + "\t" +"튜너지원여부 : " + this.getTuner());
		
	}

}
