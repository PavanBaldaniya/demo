package mypack;

public class MyDateT {
	private int day,month,year;
	
	public MyDateT()
	{
		this(1,1,2021);
	}
    
	public MyDateT(int d,int m,int y)
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
