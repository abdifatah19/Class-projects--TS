
public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddres;
	private long employeePhone;
	protected double basicSalary;
	private double specialAllowance = 250.80;
	private double Hra = 1000.50;

	public Employee(long employeeId, String employeeName, String employeeAddres, long employeePhone, double basicSalary,
			double specialAllowance, double hra) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddres = employeeAddres;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
		this.specialAllowance = specialAllowance;
		Hra = hra;
	}

	public Employee(long Id, String name, String address, long phone) {
		Id = employeeId;
		name = employeeName;
		address = employeeAddres;
		phone = employeePhone;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddres() {
		return employeeAddres;
	}

	public void setEmployeeAddres(String employeeAddres) {
		this.employeeAddres = employeeAddres;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHra() {
		return Hra;
	}

	public void setHra(double hra) {
		Hra = hra;
	}

	public double calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
		return salary;
	}

	public double calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = (0.1 * basicSalary);
		return transportAllowance;

	}

}
