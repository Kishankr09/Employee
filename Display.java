package p1;

public class Display {
	public void dis(EmpDetail d) {
		System.out.println("----------Employee Details----------");
		System.out.println("Employe Name : " + d.name + "\nDesignation : " + d.designation);
		System.out.println("Employee ID : " + d.id + "\nEmployee Basic Sal : " + d.sal);
		System.out.println("Employee Total Salary : " + d.totalSal);
	}
}
