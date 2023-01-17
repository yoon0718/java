package kunsan.yoon.codename;

abstract class Event {
	private int id;
	private String name;
	private String date;
	private int price;
	private int seat;
	private int reservedSeat;
	Event(int id, String name, String date, int price, int seat, int reservedSeat){
		this.id = id;
		this.name = name;
		this.date = date;
		this.price = price;
		this.seat = seat;
		this.reservedSeat = reservedSeat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public int getReservedSeat() {
		return reservedSeat;
	}
	public void setReservedSeat(int reservedSeat) {
		this.reservedSeat = reservedSeat;
	}
	public int getCalculation() {
		int residualSeat = seat - reservedSeat;
		return residualSeat;
	}
	
	void print() {
		
	}
}
