package mypack;

public class ArmstrongNumberCount {
	
	public static boolean IsArmstrong(int n)
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
			return true;
		else
			return false;
	}
	
	public static void armstrongCount(int count)
	{
		if(count <= 0)
			System.out.println("Invalid input !");
		else {
			int no = 1; 
			for(int i=1;i<=count;i++)
			{
				while(!IsArmstrong(no))
					no++;
				System.out.print(no+" ");
				no++;
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrongCount(1);
		armstrongCount(15);
	}

}
