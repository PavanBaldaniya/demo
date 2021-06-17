package day3;

public class ForEach2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr1 = new int[3][4];
		
		for(int[] a:arr1)
		{
			for(int i:a) 
			{
				System.out.print(i+" ");
			}
		}
		System.out.println("\n");
		
		int[][] arr2 = {{2,7,5,0},{5,8,0,7}};
		
		for(int[] a:arr2)
		{
			for(int i:a) 
			{
				System.out.print(i+" ");
			}
		}
	}

}
