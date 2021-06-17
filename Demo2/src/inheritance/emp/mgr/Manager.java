package inheritance.emp.mgr;
import inheritance.emp.*;

public class Manager extends Employee{
	
	private double incentives;
	
	public Manager()
	{
		super();
		incentives = 0;
	}
	
	public Manager(int i,String n,double s,double in)
	{
		super(i,n,s);
		incentives = in;
	}
	
	public void showIncentives()
	{
		System.out.println("Incentives : " + incentives);
	}
	
	public void display()
	{
		super.display();
		System.out.println("Incentives : " + incentives);
	}
	
	public String toString()
	{
		return super.toString() + " Incentives : " + incentives;
	}
}
