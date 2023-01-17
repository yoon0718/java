package kunsan.yoon.codename;

class Movie extends Event {
	private String movieDirector;
	private String actors;
	
	Movie(int id, String name, String date, int price, int seat, int reservedSeat, String movieDirector, String actors) {
		super(id, name, date, price, seat, reservedSeat);
		this.movieDirector = movieDirector;
		this.actors = actors;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	void print() {
		System.out.println(this.getId() + "\t" + this.getName() + "\t" + this.getDate() + "\t" + this.getPrice() + 
				"\t" + this.getSeat() + "\t" + this.getReservedSeat() + "\t" + this.getCalculation() + "\t" + "감독 : " + this.getMovieDirector() 
				+ " 출연배우 : " + this.getActors());
	}
}
