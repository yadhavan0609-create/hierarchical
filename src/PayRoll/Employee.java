package PayRoll;

public class Employee {
	public void work() {
		System.out.println("number of Work completed");
	}
	public void days() {
		System.out.println("Check the each employe number of days present");
	}
public static void main(String[] args) {
	Employee e = new Employee();
	e.work();
	e.days();
	
}
}
