package kunsan.yoon.codename;

class Musical extends Event{

	private String musicalDirector;
	private String leadName;
	private int participatingActors;
	Musical(int id, String name, String date, int price, int seat, int reservedSeat, String musicalDirector, String leadName, int participatingActors) {
		super(id, name, date, price, seat, reservedSeat);
		this.musicalDirector = musicalDirector;
		this.leadName = leadName;
		this.participatingActors = participatingActors;
	}
	public String getMusicalDirector() {
		return musicalDirector;
	}
	public void setMusicalDirector(String director) {
		this.musicalDirector = musicalDirector;
	}
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getParticipatingActors() {
		return participatingActors;
	}
	public void setParticipatingActors(int participatingActors) {
		this.participatingActors = participatingActors;
	}
	void print() {
		System.out.println(this.getId() + "\t" + this.getName() + "\t" + this.getDate() + "\t" + this.getPrice() + 
				"\t" + this.getSeat() + "\t" + this.getReservedSeat() + "\t" + this.getCalculation() + "\t" + "감독 : " + this.getMusicalDirector() 
				 + " 주연명 : " + this.getLeadName() + " 참여배우수 : " + this.getParticipatingActors());
	}
}
