package kunsan.yoon.codename;

abstract class Product {
	private String productId;
	private String modelName;
	private String company;
	private int date;
	private int stock;
	private int price;
	Product(String productId, String modelName, String company, int date, int stock, int price){
		this.productId = productId;
		this.modelName = modelName;
		this.company = company;
		this.date = date;
		this.stock = stock;
		this.price = price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	void print() {
		
	}
	

}
