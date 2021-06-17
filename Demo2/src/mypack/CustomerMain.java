package mypack;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.setName("C1");
		System.out.println(c1.getName());
		
		Customer c2 = new Customer(1,"C2",23,"Ahmedabad",123456);
		c2.printDetails();
	}

}
