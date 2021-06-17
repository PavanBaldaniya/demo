package mypack;

public class PrimeNumber {
	public static String prime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return "Not Prime";
		}
		return "Number is Prime";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prime(1));
		System.out.println(prime(5));
		System.out.println(prime(15));
	}

}
