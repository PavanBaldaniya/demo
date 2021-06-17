package inheritance.emp;

public class WageEmp extends Employee {

	private int noOfHours;
	private float ratePerHour;
	
	public WageEmp()
	{
		noOfHours = 0;
		ratePerHour = 0;
	}
	
	public WageEmp(int empId,String name,double salary,int noOfHours,float ratePerHour)
	{
		super(empId,name,salary);
		this.noOfHours = noOfHours;
		this.ratePerHour = ratePerHour;
	}
	
	public void calculateWage()
	{
		System.out.println("Wage is : " + noOfHours*ratePerHour);
	}
	
	public void display()
	{
		super.display();
		System.out.println("Number of hours : " + noOfHours);
		System.out.println("Rate per hour : " + ratePerHour);
	}
	
	public String toString()
	{
		return super.toString() + " No of hours : " + noOfHours + " Rate per hour : " + ratePerHour;
	}
	
}
