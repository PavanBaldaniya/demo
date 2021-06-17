package inheritance;
import inheritance.emp.*;
import inheritance.emp.mgr.*;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Employee
		Employee emp = new Employee(4,"Pratap",3000);
		System.out.println("Employee :");
		System.out.println(emp);
		System.out.println("\n");
		
		// Manager
		Manager mgr = new Manager();
		System.out.println("Manager :");
		mgr.display();
		System.out.println("\n Incentives :");
		mgr.showIncentives();
		System.out.println("\n Object print : ");
		System.out.println(mgr);
		
		Manager mgr2 = new Manager(5,"Pradip",8000,900);
		System.out.println("\nManager2 Incentives : ");
		mgr2.showIncentives();
		System.out.println("Display method : ");
		mgr2.display();
		System.out.println("To String method :");
		System.out.println(mgr2);
		
		// Wage Emp
		WageEmp wemp = new WageEmp();
		System.out.println("\nCalculate Wage : ");
		wemp.calculateWage();
		
		System.out.println("Display method : ");
		wemp.display();
		System.out.println("ToString method : ");
		System.out.println(wemp);
		
		WageEmp wemp2 = new WageEmp(8,"Abhay",9000,45,0.4f);
		System.out.println("\nWageEmp2 display method : ");
		wemp2.display();
		System.out.println("WageEmp2 tostring method : ");
		System.out.println(wemp2);
		
	}

}
