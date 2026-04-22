package WorkDetails;
import PayRoll.Employee;
public class Developer extends Employee{

	public void project() {
		System.out.println("project work inprogress");
	}
	
		public void work() {
			System.out.println("need to complete the project within 4 days");
		}
		public static void main(String[] args)
		{
			Developer d = new Developer();
			d.project();
			d.work();
		}	
	}