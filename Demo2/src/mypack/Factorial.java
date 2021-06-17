package mypack;

public class Factorial {

	public static int fact(int n)
	{
		if(n<0)
		{
			System.out.println("Invalid input !");
			return 0;
		}
		else if(n==0)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
		System.out.println(fact(0));
		System.out.println(fact(-1));
	}

}
