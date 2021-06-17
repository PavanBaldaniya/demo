package day3;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// Integer array using new keyword 
		int[] arr1= new int[5];
		
		// Displaying using for loop
		System.out.println("Integer array using new keyword :");
		for (int i=0;i<5;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("\n");
		
		// Integer array without using new keyword
		int[] arr2 = {1,2,3};
		
		// Displaying using for loop
		System.out.println("Integer array without using new keyword :");
		for (int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		System.out.println("\n");
		
		// String array to store city names
		String[] arr3 = {"Ahmedabad","Gandhinagar","Vadodara"};
		
		// Displaying using for loop
		System.out.println("Cities :");
		for (int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
		System.out.println("\n");
		
		// String array to store hobby names
		String[] arr4 = {"Play","Sing","Dance"};
				
		// Displaying using for loop
		System.out.println("Hobies :");
		for (int i=0;i<arr4.length;i++)
		{
			System.out.println(arr4[i]);
		}
		System.out.println("\n");
		
	}

}
