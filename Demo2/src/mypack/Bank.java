package mypack;

public class Bank {

	public static void main(String[] args) {
	
	 // Printing interest rate
     System.out.println(Account.getInterest());
     System.out.println();
     
     // Object initialized using default constructor 
     Account obj1 = new Account();
     obj1.setAccNo(1);
     obj1.setBalance(5000);
     obj1.setOwnerName("Pavan");
     obj1.setDuration(1);
     
     // Printing object details
     System.out.println(obj1.getAccNo());
     System.out.println(obj1.getOwnerName());
     System.out.println(obj1.getBalance());
     System.out.println(obj1.getDuration()); 
     System.out.println();
     
     // Object initialized  using parameterized constructor 
     Account obj2 = new Account(2,"Rohan",50000,7);
     obj2.printDetails();
     
     // Printing calculated interest
     obj2.calculateInterest();
     System.out.println();
     
     // Printing total number of objects
     System.out.println(Account.getCount());
	}

}
