package p2;
import java.util.Scanner;
public class inputDetail {
	Scanner s = new Scanner(System.in);
	public float sal;
	public int id;
	public String deg,name;
	void input() {
		System.out.println("Enter The Employee Name : ");
		name = s.nextLine();
		System.out.println("Enter The Designation of Employee : ");
		deg = s.nextLine();
		System.out.println("Enter The Id Of Employee : ");
		id = s.nextInt();
		System.out.println("Enter The Basic Salary : ");
		sal = s.nextFloat();
	}
	
	
}
