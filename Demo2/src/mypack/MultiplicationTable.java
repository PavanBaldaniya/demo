package mypack;

public class MultiplicationTable {

	public static void mulTable(int n)
	{
		if(n<=0)
			System.out.println("Invalid input !");
		else {
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+"*"+i+"="+(n*i));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mulTable(2);
	}

}
