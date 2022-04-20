
public class Main {
	public static void main(String[] args) {
		Employee empOne = new Employee("Abdullahi", "Abdifatah", 1604683, "Software Engineer");

		Employee emptwo = new Employee("Hassan", "Siyad", 4748, "Network anlyst");
		Employee empthree = new Employee("Ibrahima", "Dialo", 24748, "Devops engineer");
		Manager managerOne = new Manager("Fatuma", "ALi", 343, "Manager", " software timeCards");
		System.out.println(empOne);
		System.out.println(emptwo);
		System.out.println(empthree);
		System.out.println(managerOne);

	}
}
