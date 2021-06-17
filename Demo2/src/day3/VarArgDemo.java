package day3;

public class VarArgDemo {

	public static double average(int ...i)
	{
		double d = 0;
		int c = 1;
		
		for(int j:i)
		{
			d+=j;
			c++;
		}
		
		return d/c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(average(6));
		System.out.println(average(6,7));
		System.out.println(average(9,7,0,6));
		
	}

}
