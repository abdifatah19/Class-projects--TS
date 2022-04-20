
public class Employee {
	private String firstName;
	private String lastName;
	private int empl_id;
	private String jobtitle;

	public Employee() {

	}

	public Employee(String firstName, String lastName, int empl_id, String jobtitle) {
		// super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empl_id = empl_id;
		this.jobtitle = jobtitle;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmpl_id() {
		return empl_id;
	}

	public void setEmpl_id(int empl_id) {
		this.empl_id = empl_id;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	@Override
	public String toString() {
		return "Employee firstName=" + firstName + ", lastName=" + lastName + ", empl_id=" + empl_id + ", jobtitle="
				+ jobtitle;
	}

}
