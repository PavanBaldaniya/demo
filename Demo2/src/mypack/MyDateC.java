package mypack;

public class MyDateC {
	private int day, month, year;
	
	 public MyDateC()
	 {
		 day = month = 1;
	     year = 2021;
	 }
	 
	 public void printDate()
	 {
		 System.out.println(day + "/" + month + "/" + year);
     }
}
