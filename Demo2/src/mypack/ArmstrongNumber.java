package mypack;

public class ArmstrongNumber {
	
	public static void armstrong(int n)
	{
		int d = 1;
		int t = n;
		int sum = 0;
		
		while(t/10 != 0)
		{
			d++;
			t = t/10;
		}

		t = n;
		
		while(t!=0)
		{
			int t2 = t%10;
			int t3 = t2;
			for(int i=2;i<=d;i++)
			{
				t3 = t3*t2;
			}
			sum += t3;
			t = t/10;
		}
		if(sum==n)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Not armstrong");
	}
	
	public static void main(String[] args) {
		armstrong(153);
		armstrong(11);
		armstrong(370);
		armstrong(1634);
	}

}
