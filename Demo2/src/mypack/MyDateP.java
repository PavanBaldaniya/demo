package mypack;

public class MyDateP {
private int day,month,year;
	
	public MyDateP()
	{
		this(1,1,2021);
	}
    
	public MyDateP(int d,int m,int y)
	{
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public void printDate()
    {
    	System.out.println(day + "/" + month + "/" + year);
    }
}
