package p2;
import p1.*;

public class maccess {

	public static void main(String[] args) {
		inputDetail im = new inputDetail();
		im.input();
		EmpDetail em = new EmpDetail(im.name,im.deg,im.id,im.sal);
		Calculate c = new Calculate();
		c.cal(em);
		Display d = new Display();
		d.dis(em);

	}

}
