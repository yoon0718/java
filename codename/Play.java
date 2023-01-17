package kunsan.yoon.codename;

class Play extends Event{
	private String leadingActorName;
	private String stageDirectorName;
	Play(int id, String name, String date, int price, int seat, int reservedSeat, String leadingActorName, String stageDirectorName) {
		super(id, name, date, price, seat, reservedSeat);
		this.leadingActorName = leadingActorName;
		this.stageDirectorName = stageDirectorName;
	}

	public String getLeadingActorName() {
		return leadingActorName;
	}
	public void setLeadingActorName(String leadingActorName) {
		this.leadingActorName = leadingActorName;
	}
	public String getStageDirectorName() {
		return stageDirectorName;
	}
	public void setStageDirectorName(String stageDirectorName) {
		this.stageDirectorName = stageDirectorName;
	}
	void print() {
		System.out.println(this.getId() + "\t" + this.getName() + "\t" + this.getDate() + "\t" + this.getPrice() + 
				"\t" + this.getSeat() + "\t" + this.getReservedSeat() + "\t" + this.getCalculation() + "\t" + "주연배우명 : " + this.getLeadingActorName() 
				+ " 무대감독명 : " + this.getStageDirectorName());
	}
}
