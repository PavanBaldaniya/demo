package inheritance.emp;

public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	
	public Employee()
	{
		empId = 0;
		name = "";
		salary = 0;
	}
	
	public Employee(int empId,String name)
	{
		this.empId = empId;
		this.name = name;
	}
	
	public Employee(int empId,String name,double salary)
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	protected void display()
	{
		System.out.println("Employee Id : " + empId);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}
	
	public String toString()
	{
		return "Employee Id : " + empId + " Name : " + name + " Salary : " + salary;
	}
	
}
