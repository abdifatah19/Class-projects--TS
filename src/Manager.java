
public class Manager extends Employee {
	private String timeCards;

	public Manager() {

	}

	public Manager(String firstName, String lastName, int empl_id, String jobtitle, String timeCards) {
		super();
		this.timeCards = timeCards;

	}

	public String getTimeCards() {
		return timeCards;
	}

	public void setTimeCards(String timeCards) {
		this.timeCards = timeCards;
	}

	@Override
	public String toString() {
		return "Manager [timeCards=" + this.timeCards + "]";
	}

}
