package mypack;

public class PrimeNumberCount {

	public static void primeCount(int count)
	{
		if(count <= 0)
			System.out.println("Invalid input !");
		else {
			int no = 1; 
			for(int i=1;i<=count;i++)
			{
				while(!PrimeNumber.prime(no).equals("Number is Prime"))
					no++;
				System.out.print(no+" ");
				no++;
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeCount(1);
		primeCount(10);
	}

}
