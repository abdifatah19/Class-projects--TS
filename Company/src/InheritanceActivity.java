
public class InheritanceActivity {

	public static void main(String[] args) {
// int String String String  int int
		Manager manager = new Manager(126534, "peter", "Chennai India", 237844, 65000);
		System.out.println(manager.calculateSalary());
		Employee Trainee = new Trainee(29846, "jack", "Mumbai india", 442085, 45000);
		System.out.println(Trainee.calculateSalary());
// is it the same if we change Employee to Manager??

		// problem statment2
		System.out.println(manager.calculateTransportAllowance());
		System.out.println(Trainee.calculateTransportAllowance());
	}

}
