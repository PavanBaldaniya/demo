package inheritance.emp.mgr;
import inheritance.emp.*;

public class ManagerData extends EmployeeData {

	public Manager getEmployee()
	{
		Manager mgr = new Manager();
		return mgr;
	}
}
