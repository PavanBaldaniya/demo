package day3;

public class Array2DDemo {

	public static void main(String[] args) {
		
		// 2D Array using new keyword
		int[][] arr1 = new int[2][2];
		
		// Displaying using for loop
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
		}
		System.out.println("");
		
		// 2D Array without using new keyword 
		int[][] arr2 = {{2,4,5,6},{6,8,9,4}};
		
		// Displaying using for loop
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
		}

	}

}
