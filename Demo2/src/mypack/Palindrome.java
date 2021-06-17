package mypack;

public class Palindrome {
	public static boolean checkPalindrome(String s)
	{
		s = s.toLowerCase();
		
		for(int i=0;i<(s.length()/2)-1;i++)
		{
			if(s.charAt(i) != s.charAt(s.length()-1-i))
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome("Oppo"));
		System.out.println(checkPalindrome("Pavan"));
		System.out.println(checkPalindrome("Ada"));
	}

}
