package inheritance.emp.wage;
import inheritance.emp.*;

public class WageEmpData extends EmployeeData {
	public WageEmp getEmployee()
	{
		WageEmp wemp = new WageEmp();
		return wemp;
	}
}
