package containment;
import containment.date.*;
import containment.emp.*;

public class ContainmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setName("Pavan");
		
		MyDate date = new MyDate(1,4,98);
		emp.setBirthDate(date);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getBirthDate());
		
		System.out.println(emp);
		
		MyDate date2 = new MyDate(2,4,99);
		Employee emp2 = new Employee(2,"Kuldeep",date2);
		emp2.display();
	}

}
