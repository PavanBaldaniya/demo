package containment.emp;
import containment.date.*;

public class Employee {
	
	private int empId;
	private String name;
	private MyDate birthDate;
	
	public Employee()
	{
		empId = 0;
		name = "";
		birthDate = new MyDate();
	}
	
	public Employee(int empId,String name,MyDate birthDate)
	{
		this.empId = empId;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public MyDate getBirthDate()
	{
		return birthDate;
	}
	
	public void setEmpId(int eid)
	{
		empId = eid;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setBirthDate(MyDate bd)
	{
		birthDate = bd;
	}
	
	public void display()
	{
		System.out.println(empId);
		System.out.println(name);
		System.out.println(birthDate);
	}
	
	public String toString()
	{
		return empId+" "+name+" "+birthDate;
	}
	
}
