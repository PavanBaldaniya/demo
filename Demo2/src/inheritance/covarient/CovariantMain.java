package inheritance.covarient;
import inheritance.emp.*;
import inheritance.emp.mgr.*;
import inheritance.emp.wage.*;

public class CovariantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeData empData = new EmployeeData();
		
		// Employee
		empData.getEmployee();
		
		// Manager
		ManagerData mgrData = new ManagerData();
		mgrData.getEmployee();
		
		// WageEmp
		WageEmpData wempData = new WageEmpData();
		wempData.getEmployee();
	}

}
