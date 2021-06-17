package mypack;

public class DateMainSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDateSG o1 = new MyDateSG();
		
		o1.setDay(3);
		o1.setMonth(6);
		o1.setYear(2019);
		
		System.out.println(o1.getDay()+"/"+o1.getMonth()+"/"+o1.getYear());
		
		MyDateSG o2 = new MyDateSG(12,3,2017);
		o2.printDate();
	}

}
