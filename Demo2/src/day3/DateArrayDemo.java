package day3;
import mypack.MyDate;

public class DateArrayDemo {

	public static void main(String[] args) {
		
		MyDate[] arr = new MyDate[3];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = new MyDate();
			arr[i].printDate();
			System.out.println("\n");
		}
		
		MyDate obj1 = new MyDate();
		obj1.initDate();
		MyDate obj2 = new MyDate();
		
		MyDate[] arr2 = {obj1,obj2};
		
		for(MyDate o:arr2)
		{
			o.printDate();
			System.out.println("\n");
		}
	}

}
