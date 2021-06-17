package mypack;

public class Account {
	
	// Non static members
	private int accNo;
	private String ownerName;
    private double balance;
    private float durationYears;
    
    // Static members
    private static float interestRate;
    private static int count;
    
    // Static block
    static {
    	interestRate = 0.05F;
    }
    
    // Default constructor
    public Account()
    {
    	accNo = 0;
    	ownerName = "";
    	balance = 0;
    	durationYears = 0;
    	count++;
    }
    
    // Parameterized constructor 
    public Account(int accNo, String ownerName, double balance, float years)
    {
    	this.accNo = accNo;
    	this.ownerName = ownerName;
    	this.balance = balance;
    	durationYears = years;
    	count++;
    }
    
    // Getters and Setters 
    public void setAccNo(int n)
    {
    	accNo = n;
    }
    
    public int getAccNo()
    {
    	return accNo;
    }
    
    public void setOwnerName(String name)
    {
    	ownerName = name;
    }
    
    public String getOwnerName()
    {
    	return ownerName;
    }
    
    public void setBalance(double bal)
    {
    	balance = bal;
    }
    
    public double getBalance()
    {
    	return balance;
    }
    
    public void setDuration(float d)
    {
    	durationYears = d;
    }
    
    public float getDuration()
    {
    	return durationYears;
    }
    
    public static void setInterest(float ir)
    {
    	interestRate = ir;
    }
    
    public static float getInterest()
    {
    	return interestRate;
    }
    
    public static int getCount()
    {
    	return count;
    }
    
    // Calculating the interest
    public void calculateInterest()
    {
    	System.out.println(interestRate*balance*durationYears);
    }
    
    // Print account details
    public void printDetails()
    {
    	System.out.println(accNo);
    	System.out.println(ownerName);
    	System.out.println(balance);
    	System.out.println(durationYears);
    }
}

