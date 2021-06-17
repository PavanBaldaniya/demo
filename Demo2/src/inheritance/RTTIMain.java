package inheritance;
import inheritance.emp.*;
import inheritance.emp.mgr.*;

public class RTTIMain {
	
	public static void showEmpInfo(Employee emp)
	{
		if(emp instanceof Manager)
		{
			Manager mgr = (Manager) emp;
			mgr.display();
		}
		else if(emp instanceof WageEmp)
		{
			WageEmp wemp = (WageEmp) emp;
			wemp.display();
		}
	
	}
	
	public static void main(String[] args) 
	{
		// Manager
		Manager mgr = new Manager(13,"Kashyap",10000,1220);
		System.out.println("Manager :\n");
		showEmpInfo(mgr);
		
		// Wageemp
		WageEmp wemp = new WageEmp(14,"Parth",13000,123,0.3f);
		System.out.println("\nWageEmp :\n");
		showEmpInfo(wemp);
	}

}
