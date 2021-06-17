package mypack;

public class Fibonacci {
	public static void fibo(int n)
	{
		int t1 = 0;
		int t2 = 1;
		int t3;
		
		if(n<=0)
			System.out.print("Invalid Input !");
		else if(n==1)
		{
			System.out.print(t1);
		}
		else
		{
			System.out.print(t1+" "+t2+" ");
			for(int i=3;i<=n;i++)
			{
				t3 = t1+t2;
				System.out.print(t3+" ");
				t1 = t2;
				t2 = t3;
			}
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibo(1);
		fibo(6);
		fibo(-1);
	}

}
