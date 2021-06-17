package mypack;

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MathEngine a = new MathEngine();
        
        System.out.println(a.multiply(5, 6));
        a.multiply(5,6,7);
        System.out.println(a.multiply(5.7f, 6));
        System.out.println(a.multiply(5, 6.8f));
        
	}

}
