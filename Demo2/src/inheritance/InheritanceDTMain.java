package inheritance;
import inheritance.emp.*;
import inheritance.emp.mgr.*;

public class InheritanceDTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp;
		Manager mgr;
		
		emp = new Manager(9,"Pratyush",4000,800);
		mgr = (Manager) emp;
		
		mgr.display();
		mgr.showIncentives();
		
		Employee emp2;
		WageEmp wemp;
		
		emp2 = new WageEmp(11,"Pranav",5000,34,0.5f);
		wemp = (WageEmp) emp2;
		
		wemp.calculateWage();
		wemp.display();
	}

}
