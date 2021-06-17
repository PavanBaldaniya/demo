package mypack;

public class CharCount {

	public static int countChar(String str,char ch)
	{
		int occur = 0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				occur++;
		}
		
		return occur;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countChar("hello",'l'));
	}

}
