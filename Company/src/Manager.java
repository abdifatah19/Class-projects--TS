
public class Manager extends Employee {

	// private double salary;

	public Manager(long Id, String name, String address, long phone, double salary) {
		super(Id, name, address, phone);
		this.basicSalary = salary;

	}

	public double calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = (0.15 * basicSalary);
		return transportAllowance;

	}

}