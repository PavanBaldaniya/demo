package mypack;

public class MyDateSG {
	
	private int day,month,year;
	
	public MyDateSG()
	{
		this(1,1,2021);
	}
    
	public MyDateSG(int d,int m,int y)
	{
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setDay(int a)
	{
		day = a;
	}
	
	public void setMonth(int a)
	{
		month = a;
	}
	
	public void setYear(int a)
	{
		year = a;
	}
	
	public void printDate()
    {
    	System.out.println(day + "/" + month + "/" + year);
    }

}
