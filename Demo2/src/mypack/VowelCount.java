/*
Author : Pavan Baldaniya
Version : 1
Copyright : Sterlite Technologies LTD
*/
package mypack;

public class VowelCount {
	public static int countVowels(String s)
	{
		// Initialize the count
		int count = 0;
		
		// Count the no of vowels
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
				count++;
		}
		
		// Return the result
		return count;
	}
	public static void main(String[] args) {
		// Test cases
		System.out.println(countVowels("Pavan"));
		System.out.println(countVowels("Alias"));
		System.out.println(countVowels("Hello"));
	}

}
