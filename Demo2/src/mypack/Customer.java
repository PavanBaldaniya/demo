package mypack;

public class Customer {
	private int customerId;
	private String name;
	private int age;
	private String city;
	private int pinCode;
	
	public Customer()
	{
		customerId = 0;
		name = "";
		age = 0;
		city = "";
		pinCode = 0;
	}
	
	public Customer(int a,String b,int c,String d,int e)
	{
		customerId = a;
		name = b;
		age = c;
		city = d;
		pinCode = e;
	}
	
	public void setName(String m)
	{
		name = m;
	}
	
	public String getName()
	{
		return name;
	}
	 
	public void printDetails()
	{
		System.out.println(customerId);
		System.out.println(name);
		System.out.println(age);
		System.out.println(city);
		System.out.println(pinCode);
	}
}
