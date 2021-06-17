package mypack;

public class StringReverse {

	public static String reverse(String str)
	{
		int len = str.length();
		String res;
		char[] arr = new char[len];
		
		for(int i=0;i<len;i++)
			arr[i] = str.charAt(len - i - 1);
		
		res = new String(arr);
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("Hello"));
		System.out.println(reverse("Hello World"));
	}

}
