package mypack;

public class MyDate {
    private int day, month, year;
    
    public void initDate()
    {
    	day = month = 1;
    	year = 2021;
    }

    public void printDate()
    {
    	System.out.println(day + "/" + month + "/" + year);
    }
}
