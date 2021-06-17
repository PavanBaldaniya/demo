package day3;

public class ForEach1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Double array using new keyword 
		double[] arr1 = new double[5];
		
		// Displaying using for each loop
		System.out.println("Double array : ");
		for(double d:arr1)
		{
			System.out.print(d+" ");
		}
		System.out.println("\n");
		
		// Float array without using new keyword 
		float[] arr2 = {2.4f,6.6f,8.838f};
		
		// Displaying using for each loop
		System.out.println("Float array :");
		for(float f:arr2)
		{
			System.out.print(f+" ");
		}
		System.out.println("\n");
		
		// Sting array for flower names
		String[] arr3 = {"Rose","Sunflower"};
		
		// Displaying using for each loop
		System.out.println("Flowers :");
		for(String s:arr3)
		{
			System.out.print(s+" ");
		}
		System.out.println("\n");
		
		// Sting array for country names
		String[] arr4 = {"India","New Zealand","Sri Lanka"};
				
		// Displaying using for each loop
		System.out.println("Countries :");
		for(String s:arr4)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		
	}

}
